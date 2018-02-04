package com.example;

/*
 * see: https://stackoverflow.com/questions/26777083/best-practice-for-rest-token-based-authentication-with-jax-rs-and-jersey
 */

import javax.annotation.Priority;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.Priorities;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Secured
@Provider
@Priority( Priorities.AUTHENTICATION )
public class AuthenticationFilter implements ContainerRequestFilter
{
        private static org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger( AuthenticationFilter.class );

        private static final String REALM = "example";
        private static final String AUTHENTICATION_SCHEME = "Bearer";

        @Override
        public void filter( ContainerRequestContext requestContext ) throws java.io.IOException
        {
                log.info( "filter" );

                javax.ws.rs.core.MultivaluedMap<String, String> headers = requestContext.getHeaders();
                for( java.util.Map.Entry<String, java.util.List<String>> entry : headers.entrySet() )
                {
                        String key = entry.getKey();
                        java.util.List<String> values = entry.getValue();
                        log.info( key + "\t" + values );

                }

                String apiKey = requestContext.getHeaderString( "api_key" );
                log.info( "apiKey: " + apiKey );

                if( apiKey == null )
                {
                        abortWithUnauthorized( requestContext );
                        return;
                }

                // Get the Authorization header from the request
                String authorizationHeader = requestContext.getHeaderString( HttpHeaders.AUTHORIZATION );
                log.info( "AuthorizationHeader: " + authorizationHeader );

                final javax.ws.rs.core.SecurityContext currentSecurityContext = requestContext.getSecurityContext();
		requestContext.setSecurityContext(new javax.ws.rs.core.SecurityContext()
                {

                        @Override
                        public java.security.Principal getUserPrincipal()
                        { 
                            return () -> apiKey;
                        }

                        @Override
                        public boolean isUserInRole(String role)
                        {
                                return true;
                        }

                        @Override
                        public boolean isSecure()
                        {
                                return currentSecurityContext.isSecure();
                        }

                        @Override
                        public String getAuthenticationScheme()
                        {
                                return AUTHENTICATION_SCHEME;
                        }
                });     
        }

        private boolean isTokenBasedAuthentication( String authorizationHeader )
        {

                // Check if the Authorization header is valid
                // It must not be null and must be prefixed with "Bearer" plus a whitespace
                // The authentication scheme comparison must be case-insensitive
                return authorizationHeader != null && authorizationHeader.toLowerCase().startsWith( AUTHENTICATION_SCHEME.toLowerCase() + " " );
        }

        private void abortWithUnauthorized( ContainerRequestContext requestContext )
        {

                // Abort the filter chain with a 401 status code response
                // The WWW-Authenticate header is sent along with the response
                ErrorBean errorBean = new ErrorBean();
                errorBean.setMessage( "RTFM" );

                requestContext.abortWith(
                        Response.ok( errorBean )
                                .status( Response.Status.UNAUTHORIZED )
                                .header( HttpHeaders.WWW_AUTHENTICATE, AUTHENTICATION_SCHEME + " realm=\"" + REALM + "\"" )
                                .build() );
        }

        private void validateToken( String token ) throws Exception
        {
                // Check if the token was issued by the server and if it's not expired
                // Throw an Exception if the token is invalid
        }
}

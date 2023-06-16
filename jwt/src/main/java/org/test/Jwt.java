package org.test;

public class Jwt
{
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( Jwt.class );

	public static void dump( String jwtToken )
        {
                try
                {
                        log.trace( "------------ Decode JWT ------------" );
                        String[] split_string = jwtToken.split( "\\." );
                        String base64EncodedHeader = split_string[0];
                        String base64EncodedBody = split_string[1];
                        String base64EncodedSignature = split_string[2];

                        log.trace( "~~~~~~~~~ JWT Header ~~~~~~~" );
                        org.apache.commons.codec.binary.Base64 base64Url = new org.apache.commons.codec.binary.Base64( true );
                        String header = new String( base64Url.decode( base64EncodedHeader ) );
                        log.trace( "JWT Header : " + header );

                        log.trace( "~~~~~~~~~ JWT Body ~~~~~~~" );
                        String body = new String( base64Url.decode( base64EncodedBody ) );
                        log.trace( "JWT Body : " + body );

                        com.nimbusds.jwt.SignedJWT signedJWT = com.nimbusds.jwt.SignedJWT.parse( jwtToken );
                        com.nimbusds.jwt.JWTClaimsSet claimSet = signedJWT.getJWTClaimsSet();
                        java.util.Map<String, Object> claims = claimSet.getClaims();
                        for( java.util.Map.Entry<String, Object> claim : claims.entrySet() )
                        {
                                String key = claim.getKey();
                                Object value = claim.getValue();
                                log.trace( "Claim: " + key + "\t" + value );
                        }

                }
                catch( Exception exception )
                {
                        java.io.StringWriter sw = new java.io.StringWriter();
                        java.io.PrintWriter pw = new java.io.PrintWriter( sw );
                        exception.printStackTrace( pw );
                        log.error( "Error " + sw.toString() );
                }
        }
}

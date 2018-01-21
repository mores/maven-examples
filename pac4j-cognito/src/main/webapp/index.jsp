<!DOCTYPE html>
<html>
  <head>
    <title>AWS Cognito + Facebook Login JavaScript Example</title>
    <meta charset="UTF-8">
  </head>
<body>
  <script src="https://sdk.amazonaws.com/js/aws-sdk-2.185.0.min.js"></script>
  <script>

    var openIdToken = null;
  
    AWS.config.region = 'us-east-1';
  
    (function(d, s, id) {
      var js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id)) return;
      js = d.createElement(s); js.id = id;
      js.src = "//connect.facebook.net/en_US/sdk.js";
      fjs.parentNode.insertBefore(js, fjs);
    }(document, 'script', 'facebook-jssdk'));

    window.fbAsyncInit = function() {
      FB.init({
        appId      : '<%= pageContext.getServletContext().getInitParameter("appId") %>',
        cookie     : true, 
                           
        xfbml      : true, 
        version    : 'v2.2'
      });
      FB.getLoginStatus(statusChangeCallback);
    };


    function statusChangeCallback(response) {
      console.log('statusChangeCallback', response);

      if (response.status === 'connected' && response.authResponse) { 

        testAPI();

        AWS.config.credentials = new AWS.CognitoIdentityCredentials({
          IdentityPoolId: '<%= pageContext.getServletContext().getInitParameter("IdentityPoolId") %>',
          Logins: { 'graph.facebook.com': response.authResponse.accessToken }
        });

        AWS.config.credentials.get(function(err) {
          if (err) return console.log("Error", err);
          console.log("Cognito Identity Id", AWS.config.credentials.identityId);

	  var params = {
		  IdentityId: AWS.config.credentials.identityId,
		  Logins: { 'graph.facebook.com': response.authResponse.accessToken }
	  };
          console.log( "params: " + params );
          console.log( "params: " + params.IdentityId );

          //var cognitoidentity = new AWS.CognitoIdentity();
	  var cognitoidentity = new AWS.CognitoIdentity({apiVersion: '2014-06-30'});
          console.log( "cognitoidentity: " + cognitoidentity );

	  cognitoidentity.getOpenIdToken(params, function(err, data) {
		  if (err)
		  {
			console.log(err, err.stack); // an error occurred
		  }
		  else
		  {
			console.log( "Success: " + data.Token);           // successful response
			openIdToken = data.Token;
		  }
          });

          //console.log("accessKeyId", AWS.config.credentials.accessKeyId);
	  //console.log("secretAccessKey", AWS.config.credentials.secretAccessKey);
	  //console.log("sessionToken",AWS.config.credentials.sessionToken);
        });

      } else if (response.status === 'not_authorized') {
        document.getElementById('status').innerHTML = 'Please log into this app.';
      } else {
        document.getElementById('status').innerHTML = 'Please log into Facebook.';
      }
    }


    function testAPI() {
      console.log('Welcome!  Fetching your information.... ');
      FB.api('/me', function(response) {
        console.log('Successful login for: ' + response.name);
        document.getElementById('status').innerHTML = 'Thanks for logging in, ' + response.name + '!';
      });
    }


    function callRest() {
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "/helloworld/rest/call", true);
    xhttp.setRequestHeader("Content-type", "application/json");
    xhttp.setRequestHeader("OpenIdToken", openIdToken );
    xhttp.send();
    var response = JSON.parse(xhttp.responseText);
}

  </script>


  <fb:login-button scope="public_profile,email" onlogin="FB.getLoginStatus(statusChangeCallback);"></fb:login-button>

  <div id="status"></div>

  <button type="submit" onclick="callRest()">call rest</button>

</body>
</html>

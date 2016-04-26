
Getting an access token:

First make a call to the authorize endpoint with response_type, client_id and redirect_uri and the username/password as basic authentication.
This will redirect to the redirect_uri with a code in the url.

http://localhost:9999/uaa/oauth/authorize?response_type=code&client_id=acme&redirect_uri=http://example.com

On this redirect_uri you should catch the code (if you are authorized) and the perform a post with the token as stated below.

http://localhost:9999/uaa/oauth/token?grant_type=authorization&code=**the code we got form authorize here**&redirect_uri=http://example.com
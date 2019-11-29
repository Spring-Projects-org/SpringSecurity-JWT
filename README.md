# SpringSecurity
SpringSecurity OAuth-2 

We need to create client Id and secret Id on Google cloud before configuration

Google cloud-->console-->APIs and Services-->
1. OAuth consent screen
2. credential

security.oauth2.client.clientId = <CLIENT_ID>
security.oauth2.client.clientSecret = <CLIENT_SECRET>
security.oauth2.client.accessTokenUri = https://www.googleapis.com/oauth2/v3/token
security.oauth2.client.userAuthorizationUri = https://accounts.google.com/o/oauth2/auth
security.oauth2.client.tokenName= oauth_token
security.oauth2.client.authenticationScheme = query
security.oauth2.client.clientAuthenticationScheme = form
security.oauth2.client.scope = profile email
security.oauth2.resource.userInfoUri = https://www.googleapis.com/userinfo/v2/me
security.oauth2.resource.preferTokenInfo = false



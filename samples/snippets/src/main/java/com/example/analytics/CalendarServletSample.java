package com.example.analytics;
import java.io.IOException;

import javax.jdo.JDOHelper;
//import javax.jdo.PersistenceManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.extensions.jdo.auth.oauth2.JdoCredentialStore;
import com.google.api.client.extensions.servlet.auth.oauth2.AbstractAuthorizationCodeServlet;
import com.google.api.client.http.BasicAuthentication;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson.JacksonFactory;
public class CalendarServletSample extends AbstractAuthorizationCodeServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {
    // do stuff
  }

  @Override
  protected String getRedirectUri(HttpServletRequest req) throws ServletException, IOException {
    GenericUrl url = new GenericUrl(req.getRequestURL().toString());
    url.setRawPath("/oauth2callback");
    return url.build();
  }

  @Override
  protected AuthorizationCodeFlow initializeFlow() throws IOException {
    return new GoogleAuthorizationCodeFlow.Builder(
        new NetHttpTransport(), GsonFactory.getDefaultInstance(),
        "[[ENTER YOUR CLIENT ID]]", "[[ENTER YOUR CLIENT SECRET]]",
        Collections.singleton(CalendarScopes.CALENDAR)).setDataStoreFactory(
        DATA_STORE_FACTORY).setAccessType("offline").build();
  }

  @Override
  protected String getUserId(HttpServletRequest req) throws ServletException, IOException {
    // return user ID
  }
}


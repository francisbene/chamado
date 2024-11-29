package com.sistemachamado.general.ui ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.sistemachamado.general.ui.masterprompt", "/com.sistemachamado.general.ui.masterprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class masterprompt extends GXWebPanelStub
{
   public masterprompt( )
   {
   }

   public masterprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( masterprompt.class ));
   }

   public masterprompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new masterprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new masterprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Prompt Master Page";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}


package com.sistemachamado.general.ui ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.sistemachamado.general.ui.masterunanimosidebar", "/com.sistemachamado.general.ui.masterunanimosidebar"})
@jakarta.servlet.annotation.MultipartConfig
public final  class masterunanimosidebar extends GXWebPanelStub
{
   public masterunanimosidebar( )
   {
   }

   public masterunanimosidebar( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( masterunanimosidebar.class ));
   }

   public masterunanimosidebar( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new masterunanimosidebar_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new masterunanimosidebar_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Master Unanimo Sidebar";
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


package com.sistemachamado ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.sistemachamado.gx0010", "/com.sistemachamado.gx0010"})
@jakarta.servlet.annotation.MultipartConfig
public final  class gx0010 extends GXWebPanelStub
{
   public gx0010( )
   {
   }

   public gx0010( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( gx0010.class ));
   }

   public gx0010( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gx0010_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new gx0010_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selection List Chamado";
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


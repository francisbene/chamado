package com.sistemachamado ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.sistemachamado.chamado", "/com.sistemachamado.chamado"})
@jakarta.servlet.annotation.MultipartConfig
public final  class chamado extends GXWebPanelStub
{
   public chamado( )
   {
   }

   public chamado( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( chamado.class ));
   }

   public chamado( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new chamado_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new chamado_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Chamado";
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


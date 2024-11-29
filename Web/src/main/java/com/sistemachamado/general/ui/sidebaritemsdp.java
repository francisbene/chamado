package com.sistemachamado.general.ui ;
import com.sistemachamado.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class sidebaritemsdp extends GXProcedure
{
   public sidebaritemsdp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sidebaritemsdp.class ), "" );
   }

   public sidebaritemsdp( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem> executeUdp( )
   {
      sidebaritemsdp.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>[] aP0 )
   {
      sidebaritemsdp.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   protected void privateExecute( )
   {
      Gxm1sidebaritems = (com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem)new com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem(remoteHandle, context);
      Gxm2rootcol.add(Gxm1sidebaritems, 0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = sidebaritemsdp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>(com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem.class, "SidebarItem", "GeneXusUnanimo", remoteHandle);
      Gxm1sidebaritems = new com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem(remoteHandle, context);
      /* GeneXus formulas. */
   }

   private GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>[] aP0 ;
   private GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem> Gxm2rootcol ;
   private com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem Gxm1sidebaritems ;
}


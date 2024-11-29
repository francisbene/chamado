package com.sistemachamado ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class Reorganization extends GXReorganization
{
   ModelContext context;
   public static void main( String args[] )
   {
      new Reorganization().executeReorg(args, true);
   }

   public Reorganization( )
   {
      super(GXcfg.class);
   }

   public String getPackageDir( )
   {
      return "com\\sistemachamado\\" ;
   }

   public void execute( )
   {
      context = new ModelContext(getClass());
      reorg r = new reorg(getHandle());
      setReorgProcedure(r);
      r.execute();
   }

}


package com.sistemachamado ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class GXcfg
{
   public static int strcmp( String Left ,
                             String Right )
   {
      return GXutil.rtrim(Left).compareTo(GXutil.rtrim(Right));
   }

}


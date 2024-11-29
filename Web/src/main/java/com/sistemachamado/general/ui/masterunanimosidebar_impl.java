package com.sistemachamado.general.ui ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class masterunanimosidebar_impl extends GXMasterPage
{
   public masterunanimosidebar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public masterunanimosidebar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( masterunanimosidebar_impl.class ));
   }

   public masterunanimosidebar_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa012( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws012( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we012( ) ;
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      if ( ! isFullAjaxMode( ) )
      {
         GXWebForm.addResponsiveMetaHeaders((getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta());
         getDataAreaObject().renderHtmlHeaders();
      }
   }

   public void renderHtmlOpenForm( )
   {
      if ( ! isFullAjaxMode( ) )
      {
         getDataAreaObject().renderHtmlOpenForm();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vSIDEBARITEMS_MPAGE", AV5sidebarItems);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSIDEBARITEMS_MPAGE", AV5sidebarItems);
      }
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "vTARGET_MPAGE", AV6target);
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "SIDEBARMENU_MPAGE_Title", GXutil.rtrim( Sidebarmenu_Title));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "SIDEBARMENU_MPAGE_Distancetotop", GXutil.ltrim( localUtil.ntoc( Sidebarmenu_Distancetotop, (byte)(9), (byte)(0), ".", "")));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "SIDEBARMENU_MPAGE_Selecteditemtarget", GXutil.rtrim( Sidebarmenu_Selecteditemtarget));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "SIDEBARMENU_MPAGE_Iscollapsed", GXutil.booltostr( Sidebarmenu_Iscollapsed));
   }

   public void renderHtmlCloseForm012( )
   {
      sendCloseFormHiddens( ) ;
      sendSecurityToken(sPrefix);
      if ( ! isFullAjaxMode( ) )
      {
         getDataAreaObject().renderHtmlCloseForm();
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.AddJavascriptSource("Unanimo_chameleon/chameleon.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/GeneXusUnanimo.SidebarRender.js", "", false, true);
      httpContext.AddJavascriptSource("general/ui/masterunanimosidebar.js", "?202411291034518", false, true);
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "General.UI.MasterUnanimoSidebar" ;
   }

   public String getPgmdesc( )
   {
      return "Master Unanimo Sidebar" ;
   }

   public void wb010( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         if ( ! ShowMPWhenPopUp( ) && httpContext.isPopUpObject( ) )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableOutput();
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            /* Content placeholder */
            httpContext.writeText( "<div") ;
            com.sistemachamado.GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
            httpContext.writeText( ">") ;
            if ( ! isFullAjaxMode( ) )
            {
               getDataAreaObject().renderHtmlContent();
            }
            httpContext.writeText( "</div>") ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
            wbLoad = true ;
            return  ;
         }
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"none\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "MainContainer", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, divHeader_Internalname, 1, 0, "px", 0, "px", "HeaderContainer ContainerFluid", "start", "top", " "+"data-gx-flex"+" ", "align-items:center;", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 24, "px", "", "start", "top", "", "align-self:center;", "div");
         /* Static images/pictures */
         ClassString = "sidebar__toggle-ico" + " " + ((GXutil.strcmp(imgImage2_gximage, "")==0) ? "GX_Image_GeneXusUnanimo_list_view_white_Class" : "GX_Image_"+imgImage2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "ef73725b-c186-4f57-94bc-867e0a183c3e", "", context.getHttpContext().getTheme( )) ;
         com.sistemachamado.GxWebStd.gx_bitmap( httpContext, imgImage2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_General/UI/MasterUnanimoSidebar.htm");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "start", "top", "", "min-height:20px;", "div");
         /* Static images/pictures */
         ClassString = "header__logo" + " " + ((GXutil.strcmp(imgImage1_gximage, "")==0) ? "GX_Image_GeneXusUnanimo_genexus_logo_Class" : "GX_Image_"+imgImage1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "194a18de-81a7-4ab6-8eb3-5191aa65f696", "", context.getHttpContext().getTheme( )) ;
         com.sistemachamado.GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_General/UI/MasterUnanimoSidebar.htm");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "Center", "top", "", "flex-grow:1;min-height:20px;", "div");
         /* Text block */
         com.sistemachamado.GxWebStd.gx_label_ctrl( httpContext, lblApplicationheader_Internalname, "Application Name", "", "", lblApplicationheader_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "header__title", 0, "", 1, 1, 0, (short)(0), "HLP_General/UI/MasterUnanimoSidebar.htm");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, divTablesidebarcontainer_Internalname, 1, 0, "px", 0, "px", "Table", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* User Defined Control */
         ucSidebarmenu.setProperty("Title", Sidebarmenu_Title);
         ucSidebarmenu.setProperty("SidebarItems", AV5sidebarItems);
         ucSidebarmenu.render(context, "genexusunanimo.sidebar", Sidebarmenu_Internalname, "SIDEBARMENU_MPAGEContainer");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, divContent_Internalname, 1, 0, "px", 0, "px", divContent_Class, "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
         /* Div Control */
         com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         /* Content placeholder */
         httpContext.writeText( "<div") ;
         com.sistemachamado.GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
         httpContext.writeText( ">") ;
         if ( ! isFullAjaxMode( ) )
         {
            getDataAreaObject().renderHtmlContent();
         }
         httpContext.writeText( "</div>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
         com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      }
      wbLoad = true ;
   }

   public void start012( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup010( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( getDataAreaObject().executeStartEvent() != 0 )
         {
            httpContext.setAjaxCallMode();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void ws012( )
   {
      start012( ) ;
      evt012( ) ;
   }

   public void evt012( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "RFR_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e11012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               if ( httpContext.wbHandled == 0 )
               {
                  getDataAreaObject().dispatchEvents();
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we012( )
   {
      if ( ! com.sistemachamado.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! com.sistemachamado.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm012( ) ;
         }
      }
   }

   public void pa012( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf012( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
   }

   public void rf012( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ShowMPWhenPopUp( ) || ! httpContext.isPopUpObject( ) )
      {
         gxdyncontrolsrefreshing = true ;
         fix_multi_value_controls( ) ;
         gxdyncontrolsrefreshing = false ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e11012 ();
         wb010( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
   }

   public void send_integrity_lvl_hashes012( )
   {
   }

   public void before_start_formulas( )
   {
      fix_multi_value_controls( ) ;
   }

   public void strup010( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.readJsonSdtValue(httpContext.cgiGet( "vSIDEBARITEMS_MPAGE"), AV5sidebarItems);
         /* Read saved values. */
         AV6target = httpContext.cgiGet( "vTARGET_MPAGE") ;
         Sidebarmenu_Title = httpContext.cgiGet( "SIDEBARMENU_MPAGE_Title") ;
         Sidebarmenu_Distancetotop = (int)(localUtil.ctol( httpContext.cgiGet( "SIDEBARMENU_MPAGE_Distancetotop"), ",", ".")) ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e11012( )
   {
      /* Load Routine */
      returnInSub = false ;
      Sidebarmenu_Title = "Unanimo" ;
      ucSidebarmenu.sendProperty(context, "", true, Sidebarmenu_Internalname, "Title", Sidebarmenu_Title);
      Sidebarmenu_Distancetotop = 60 ;
      ucSidebarmenu.sendProperty(context, "", true, Sidebarmenu_Internalname, "DistanceToTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(Sidebarmenu_Distancetotop), 9, 0));
      GXt_objcol_SdtSidebarItems_SidebarItem1 = AV5sidebarItems ;
      GXv_objcol_SdtSidebarItems_SidebarItem2[0] = GXt_objcol_SdtSidebarItems_SidebarItem1 ;
      new com.sistemachamado.general.ui.sidebaritemsdp(remoteHandle, context).execute( GXv_objcol_SdtSidebarItems_SidebarItem2) ;
      GXt_objcol_SdtSidebarItems_SidebarItem1 = GXv_objcol_SdtSidebarItems_SidebarItem2[0] ;
      AV5sidebarItems = GXt_objcol_SdtSidebarItems_SidebarItem1 ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa012( ) ;
      ws012( ) ;
      we012( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void master_styles( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("Unanimo_chameleon/chameleon.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?2024112910345115", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("general/ui/masterunanimosidebar.js", "?2024112910345115", false, true);
      httpContext.AddJavascriptSource("Unanimo_chameleon/chameleon.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/GeneXusUnanimo.SidebarRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgImage2_Internalname = "IMAGE2_MPAGE" ;
      imgImage1_Internalname = "IMAGE1_MPAGE" ;
      lblApplicationheader_Internalname = "APPLICATIONHEADER_MPAGE" ;
      divHeader_Internalname = "HEADER_MPAGE" ;
      Sidebarmenu_Internalname = "SIDEBARMENU_MPAGE" ;
      divTablesidebarcontainer_Internalname = "TABLESIDEBARCONTAINER_MPAGE" ;
      divContent_Internalname = "CONTENT_MPAGE" ;
      divMaintable_Internalname = "MAINTABLE_MPAGE" ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setInternalname( "FORM_MPAGE" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      divContent_Class = "expandible-container" ;
      Sidebarmenu_Iscollapsed = GXutil.toBoolean( 0) ;
      Sidebarmenu_Selecteditemtarget = "" ;
      Sidebarmenu_Distancetotop = 0 ;
      Sidebarmenu_Title = "" ;
      Contentholder.setDataArea(getDataAreaObject());
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH_MPAGE","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH_MPAGE",",oparms:[]}");
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

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Contentholder = new com.genexus.webpanels.GXDataAreaControl();
      Form = new com.genexus.webpanels.GXWebForm();
      GXKey = "" ;
      AV5sidebarItems = new GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>(com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem.class, "SidebarItem", "GeneXusUnanimo", remoteHandle);
      AV6target = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      imgImage2_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      imgImage1_gximage = "" ;
      lblApplicationheader_Jsonclick = "" ;
      ucSidebarmenu = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXt_objcol_SdtSidebarItems_SidebarItem1 = new GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem>(com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem.class, "SidebarItem", "GeneXusUnanimo", remoteHandle);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sDynURL = "" ;
      /* GeneXus formulas. */
      initializeGenerics();
   }

   @SuppressWarnings("unchecked")
   private void initializeGenerics( )
   {
      GXv_objcol_SdtSidebarItems_SidebarItem2 = new GXBaseCollection[1] ;
   }

   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGotPars ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private int Sidebarmenu_Distancetotop ;
   private int idxLst ;
   private String Sidebarmenu_Selecteditemtarget ;
   private String GXKey ;
   private String Sidebarmenu_Title ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divHeader_Internalname ;
   private String ClassString ;
   private String imgImage2_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgImage2_Internalname ;
   private String imgImage1_gximage ;
   private String imgImage1_Internalname ;
   private String lblApplicationheader_Internalname ;
   private String lblApplicationheader_Jsonclick ;
   private String divTablesidebarcontainer_Internalname ;
   private String Sidebarmenu_Internalname ;
   private String divContent_Internalname ;
   private String divContent_Class ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sDynURL ;
   private boolean Sidebarmenu_Iscollapsed ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean toggleJsOutput ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV6target ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucSidebarmenu ;
   private com.genexus.webpanels.GXDataAreaControl Contentholder ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem> AV5sidebarItems ;
   private GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem> GXt_objcol_SdtSidebarItems_SidebarItem1 ;
   private GXBaseCollection<com.unanimo.genexusunanimo.SdtSidebarItems_SidebarItem> GXv_objcol_SdtSidebarItems_SidebarItem2[] ;
}


package com.sistemachamado ;
import com.sistemachamado.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class chamado_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 18_0_8-180599", (short)(0)) ;
         }
      }
      Form.getMeta().addItem("description", "Chamado", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtChamadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("SISTEMA_CHAMADO", true);
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public chamado_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public chamado_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( chamado_impl.class ));
   }

   public chamado_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.sistemachamado.general.ui.masterunanimosidebar");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.sistemachamado.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "start", "top", " "+"data-gx-base-lib=\"none\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "title-container", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Text block */
      com.sistemachamado.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Chamado", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "heading-01", 0, "", 1, 1, 0, (short)(0), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "form-container", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 form__toolbar-cell", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-first" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-prev" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-next" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "Button button-auxiliary ico__arrow-last" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "Button button-secondary" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Selecionar", bttBtn_select_Jsonclick, 4, "Selecionar", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.sistemachamado.gx0010"+"',["+"{Ctrl:gx.dom.el('"+"CHAMADOID"+"'), id:'"+"CHAMADOID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell-advanced", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtChamadoId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.sistemachamado.GxWebStd.gx_label_element( httpContext, edtChamadoId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.sistemachamado.GxWebStd.gx_single_line_edit( httpContext, edtChamadoId_Internalname, GXutil.ltrim( localUtil.ntoc( A1ChamadoId, (byte)(4), (byte)(0), ",", "")), GXutil.ltrim( ((edtChamadoId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1ChamadoId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1ChamadoId), "ZZZ9"))), " dir=\"ltr\" inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,'.');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtChamadoId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtChamadoId_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Id", "end", false, "", "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtChamadoDescricao_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.sistemachamado.GxWebStd.gx_label_element( httpContext, edtChamadoDescricao_Internalname, "Descricao", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_html_textarea( httpContext, edtChamadoDescricao_Internalname, A2ChamadoDescricao, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", (short)(0), 1, edtChamadoDescricao_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "250", -1, 0, "", "", (byte)(-1), true, "Descricao", "'"+""+"'"+",false,"+"'"+""+"'", 0, "", "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtChamadoCriacaoDate_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.sistemachamado.GxWebStd.gx_label_element( httpContext, edtChamadoCriacaoDate_Internalname, "Criacao Date", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtChamadoCriacaoDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.sistemachamado.GxWebStd.gx_single_line_edit( httpContext, edtChamadoCriacaoDate_Internalname, localUtil.ttoc( A3ChamadoCriacaoDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A3ChamadoCriacaoDate, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'por',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtChamadoCriacaoDate_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtChamadoCriacaoDate_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_bitmap( httpContext, edtChamadoCriacaoDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtChamadoCriacaoDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Chamado.htm");
      httpContext.writeTextNL( "</div>") ;
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__cell", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "start", "top", ""+" data-gx-for=\""+edtChamadoResolucaoDate_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.sistemachamado.GxWebStd.gx_label_element( httpContext, edtChamadoResolucaoDate_Internalname, "Resolucao Date", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "start", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtChamadoResolucaoDate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      com.sistemachamado.GxWebStd.gx_single_line_edit( httpContext, edtChamadoResolucaoDate_Internalname, localUtil.ttoc( A4ChamadoResolucaoDate, 10, 8, 0, 3, "/", ":", " "), localUtil.format( A4ChamadoResolucaoDate, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'por',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'DMY',5,24,'por',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtChamadoResolucaoDate_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtChamadoResolucaoDate_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "end", false, "", "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_bitmap( httpContext, edtChamadoResolucaoDate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtChamadoResolucaoDate_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Chamado.htm");
      httpContext.writeTextNL( "</div>") ;
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "start", "top", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 form__actions--fixed", "end", "Middle", "", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group", "start", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Button button-primary" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirmar", bttBtn_enter_Jsonclick, 5, "Confirmar", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Fechar", bttBtn_cancel_Jsonclick, 1, "Fechar", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      /* Div Control */
      com.sistemachamado.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "start", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "Button button-tertiary" ;
      StyleString = "" ;
      com.sistemachamado.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Eliminar", bttBtn_delete_Jsonclick, 5, "Eliminar", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Chamado.htm");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "end", "Middle", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
      com.sistemachamado.GxWebStd.gx_div_end( httpContext, "start", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z1ChamadoId = (short)(localUtil.ctol( httpContext.cgiGet( "Z1ChamadoId"), ",", ".")) ;
         Z2ChamadoDescricao = httpContext.cgiGet( "Z2ChamadoDescricao") ;
         Z3ChamadoCriacaoDate = localUtil.ctot( httpContext.cgiGet( "Z3ChamadoCriacaoDate"), 0) ;
         Z4ChamadoResolucaoDate = localUtil.ctot( httpContext.cgiGet( "Z4ChamadoResolucaoDate"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ",", ".")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ",", ".")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtChamadoId_Internalname), ",", ".") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtChamadoId_Internalname), ",", ".") > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CHAMADOID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtChamadoId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1ChamadoId = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
         }
         else
         {
            A1ChamadoId = (short)(localUtil.ctol( httpContext.cgiGet( edtChamadoId_Internalname), ",", ".")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
         }
         A2ChamadoDescricao = httpContext.cgiGet( edtChamadoDescricao_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2ChamadoDescricao", A2ChamadoDescricao);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtChamadoCriacaoDate_Internalname), (byte)(3), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CHAMADOCRIACAODATE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtChamadoCriacaoDate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3ChamadoCriacaoDate = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A3ChamadoCriacaoDate", localUtil.ttoc( A3ChamadoCriacaoDate, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            A3ChamadoCriacaoDate = localUtil.ctot( httpContext.cgiGet( edtChamadoCriacaoDate_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3ChamadoCriacaoDate", localUtil.ttoc( A3ChamadoCriacaoDate, 8, 5, 0, 3, "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtChamadoResolucaoDate_Internalname), (byte)(3), (byte)(0)) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CHAMADORESOLUCAODATE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtChamadoResolucaoDate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4ChamadoResolucaoDate = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A4ChamadoResolucaoDate", localUtil.ttoc( A4ChamadoResolucaoDate, 8, 5, 0, 3, "/", ":", " "));
         }
         else
         {
            A4ChamadoResolucaoDate = localUtil.ctot( httpContext.cgiGet( edtChamadoResolucaoDate_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4ChamadoResolucaoDate", localUtil.ttoc( A4ChamadoResolucaoDate, 8, 5, 0, 3, "/", ":", " "));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A1ChamadoId = (short)(GXutil.lval( httpContext.GetPar( "ChamadoId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll011( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes011( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption010( )
   {
   }

   public void zm011( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2ChamadoDescricao = T00013_A2ChamadoDescricao[0] ;
            Z3ChamadoCriacaoDate = T00013_A3ChamadoCriacaoDate[0] ;
            Z4ChamadoResolucaoDate = T00013_A4ChamadoResolucaoDate[0] ;
         }
         else
         {
            Z2ChamadoDescricao = A2ChamadoDescricao ;
            Z3ChamadoCriacaoDate = A3ChamadoCriacaoDate ;
            Z4ChamadoResolucaoDate = A4ChamadoResolucaoDate ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1ChamadoId = A1ChamadoId ;
         Z2ChamadoDescricao = A2ChamadoDescricao ;
         Z3ChamadoCriacaoDate = A3ChamadoCriacaoDate ;
         Z4ChamadoResolucaoDate = A4ChamadoResolucaoDate ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load011( )
   {
      /* Using cursor T00014 */
      pr_default.execute(2, new Object[] {Short.valueOf(A1ChamadoId)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A2ChamadoDescricao = T00014_A2ChamadoDescricao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2ChamadoDescricao", A2ChamadoDescricao);
         A3ChamadoCriacaoDate = T00014_A3ChamadoCriacaoDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3ChamadoCriacaoDate", localUtil.ttoc( A3ChamadoCriacaoDate, 8, 5, 0, 3, "/", ":", " "));
         A4ChamadoResolucaoDate = T00014_A4ChamadoResolucaoDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ChamadoResolucaoDate", localUtil.ttoc( A4ChamadoResolucaoDate, 8, 5, 0, 3, "/", ":", " "));
         zm011( -1) ;
      }
      pr_default.close(2);
      onLoadActions011( ) ;
   }

   public void onLoadActions011( )
   {
   }

   public void checkExtendedTable011( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors011( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey011( )
   {
      /* Using cursor T00015 */
      pr_default.execute(3, new Object[] {Short.valueOf(A1ChamadoId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00013 */
      pr_default.execute(1, new Object[] {Short.valueOf(A1ChamadoId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm011( 1) ;
         RcdFound1 = (short)(1) ;
         A1ChamadoId = T00013_A1ChamadoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
         A2ChamadoDescricao = T00013_A2ChamadoDescricao[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2ChamadoDescricao", A2ChamadoDescricao);
         A3ChamadoCriacaoDate = T00013_A3ChamadoCriacaoDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3ChamadoCriacaoDate", localUtil.ttoc( A3ChamadoCriacaoDate, 8, 5, 0, 3, "/", ":", " "));
         A4ChamadoResolucaoDate = T00013_A4ChamadoResolucaoDate[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4ChamadoResolucaoDate", localUtil.ttoc( A4ChamadoResolucaoDate, 8, 5, 0, 3, "/", ":", " "));
         Z1ChamadoId = A1ChamadoId ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load011( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey011( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey011( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey011( ) ;
      if ( RcdFound1 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00016 */
      pr_default.execute(4, new Object[] {Short.valueOf(A1ChamadoId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00016_A1ChamadoId[0] < A1ChamadoId ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00016_A1ChamadoId[0] > A1ChamadoId ) ) )
         {
            A1ChamadoId = T00016_A1ChamadoId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T00017 */
      pr_default.execute(5, new Object[] {Short.valueOf(A1ChamadoId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00017_A1ChamadoId[0] > A1ChamadoId ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00017_A1ChamadoId[0] < A1ChamadoId ) ) )
         {
            A1ChamadoId = T00017_A1ChamadoId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey011( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtChamadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert011( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( A1ChamadoId != Z1ChamadoId )
            {
               A1ChamadoId = Z1ChamadoId ;
               httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CHAMADOID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtChamadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtChamadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update011( ) ;
               GX_FocusControl = edtChamadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A1ChamadoId != Z1ChamadoId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtChamadoId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert011( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CHAMADOID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtChamadoId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtChamadoId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert011( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A1ChamadoId != Z1ChamadoId )
      {
         A1ChamadoId = Z1ChamadoId ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CHAMADOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtChamadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtChamadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "CHAMADOID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtChamadoId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtChamadoDescricao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtChamadoDescricao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd011( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtChamadoDescricao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtChamadoDescricao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart011( ) ;
      if ( RcdFound1 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1 != 0 )
         {
            scanNext011( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtChamadoDescricao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd011( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency011( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00012 */
         pr_default.execute(0, new Object[] {Short.valueOf(A1ChamadoId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Chamado"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2ChamadoDescricao, T00012_A2ChamadoDescricao[0]) != 0 ) || !( GXutil.dateCompare(Z3ChamadoCriacaoDate, T00012_A3ChamadoCriacaoDate[0]) ) || !( GXutil.dateCompare(Z4ChamadoResolucaoDate, T00012_A4ChamadoResolucaoDate[0]) ) )
         {
            if ( GXutil.strcmp(Z2ChamadoDescricao, T00012_A2ChamadoDescricao[0]) != 0 )
            {
               GXutil.writeLogln("chamado:[seudo value changed for attri]"+"ChamadoDescricao");
               GXutil.writeLogRaw("Old: ",Z2ChamadoDescricao);
               GXutil.writeLogRaw("Current: ",T00012_A2ChamadoDescricao[0]);
            }
            if ( !( GXutil.dateCompare(Z3ChamadoCriacaoDate, T00012_A3ChamadoCriacaoDate[0]) ) )
            {
               GXutil.writeLogln("chamado:[seudo value changed for attri]"+"ChamadoCriacaoDate");
               GXutil.writeLogRaw("Old: ",Z3ChamadoCriacaoDate);
               GXutil.writeLogRaw("Current: ",T00012_A3ChamadoCriacaoDate[0]);
            }
            if ( !( GXutil.dateCompare(Z4ChamadoResolucaoDate, T00012_A4ChamadoResolucaoDate[0]) ) )
            {
               GXutil.writeLogln("chamado:[seudo value changed for attri]"+"ChamadoResolucaoDate");
               GXutil.writeLogRaw("Old: ",Z4ChamadoResolucaoDate);
               GXutil.writeLogRaw("Current: ",T00012_A4ChamadoResolucaoDate[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"Chamado"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         zm011( 0) ;
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00018 */
                  pr_default.execute(6, new Object[] {Short.valueOf(A1ChamadoId), A2ChamadoDescricao, A3ChamadoCriacaoDate, A4ChamadoResolucaoDate});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Chamado");
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption010( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load011( ) ;
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void update011( )
   {
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable011( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm011( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate011( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00019 */
                  pr_default.execute(7, new Object[] {A2ChamadoDescricao, A3ChamadoCriacaoDate, A4ChamadoResolucaoDate, Short.valueOf(A1ChamadoId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Chamado");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"Chamado"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate011( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption010( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel011( ) ;
      }
      closeExtendedTableCursors011( ) ;
   }

   public void deferredUpdate011( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate011( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency011( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls011( ) ;
         afterConfirm011( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete011( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000110 */
               pr_default.execute(8, new Object[] {Short.valueOf(A1ChamadoId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Chamado");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1 == 0 )
                     {
                        initAll011( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption010( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel011( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls011( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel011( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete011( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "chamado");
         if ( AnyError == 0 )
         {
            confirmValues010( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "chamado");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart011( )
   {
      /* Using cursor T000111 */
      pr_default.execute(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1ChamadoId = T000111_A1ChamadoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext011( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A1ChamadoId = T000111_A1ChamadoId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
      }
   }

   public void scanEnd011( )
   {
      pr_default.close(9);
   }

   public void afterConfirm011( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert011( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate011( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete011( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete011( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate011( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes011( )
   {
      edtChamadoId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtChamadoId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtChamadoId_Enabled), 5, 0), true);
      edtChamadoDescricao_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtChamadoDescricao_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtChamadoDescricao_Enabled), 5, 0), true);
      edtChamadoCriacaoDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtChamadoCriacaoDate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtChamadoCriacaoDate_Enabled), 5, 0), true);
      edtChamadoResolucaoDate_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtChamadoResolucaoDate_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtChamadoResolucaoDate_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes011( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues010( )
   {
   }

   public void renderHtmlHeaders( )
   {
      com.sistemachamado.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      httpContext.CloseStyles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.AddJavascriptSource("calendar-pt.js", "?"+httpContext.getBuildNumber( 1720180), false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      if ( GXutil.strcmp(httpContext.getLanguageProperty( "rtl"), "true") == 0 )
      {
         httpContext.writeText( " dir=\"rtl\" ") ;
      }
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.sistemachamado.chamado", new String[] {}, new String[] {}) +"\">") ;
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<div style=\"height:0;overflow:hidden\"><input type=\"submit\" title=\"submit\"  disabled></div>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
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
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z1ChamadoId", GXutil.ltrim( localUtil.ntoc( Z1ChamadoId, (byte)(4), (byte)(0), ",", "")));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z2ChamadoDescricao", Z2ChamadoDescricao);
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z3ChamadoCriacaoDate", localUtil.ttoc( Z3ChamadoCriacaoDate, 10, 8, 0, 0, "/", ":", " "));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z4ChamadoResolucaoDate", localUtil.ttoc( Z4ChamadoResolucaoDate, 10, 8, 0, 0, "/", ":", " "));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ",", "")));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ",", "")));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.sistemachamado.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.sistemachamado.chamado", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Chamado" ;
   }

   public String getPgmdesc( )
   {
      return "Chamado" ;
   }

   public void initializeNonKey011( )
   {
      A2ChamadoDescricao = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2ChamadoDescricao", A2ChamadoDescricao);
      A3ChamadoCriacaoDate = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A3ChamadoCriacaoDate", localUtil.ttoc( A3ChamadoCriacaoDate, 8, 5, 0, 3, "/", ":", " "));
      A4ChamadoResolucaoDate = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4ChamadoResolucaoDate", localUtil.ttoc( A4ChamadoResolucaoDate, 8, 5, 0, 3, "/", ":", " "));
      Z2ChamadoDescricao = "" ;
      Z3ChamadoCriacaoDate = GXutil.resetTime( GXutil.nullDate() );
      Z4ChamadoResolucaoDate = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll011( )
   {
      A1ChamadoId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1ChamadoId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1ChamadoId), 4, 0));
      initializeNonKey011( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2024112910345630", true, true);
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
      httpContext.AddJavascriptSource("messages.por.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("chamado.js", "?2024112910345630", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtChamadoId_Internalname = "CHAMADOID" ;
      edtChamadoDescricao_Internalname = "CHAMADODESCRICAO" ;
      edtChamadoCriacaoDate_Internalname = "CHAMADOCRIACAODATE" ;
      edtChamadoResolucaoDate_Internalname = "CHAMADORESOLUCAODATE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("SISTEMA_CHAMADO", true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Chamado" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtChamadoResolucaoDate_Jsonclick = "" ;
      edtChamadoResolucaoDate_Enabled = 1 ;
      edtChamadoCriacaoDate_Jsonclick = "" ;
      edtChamadoCriacaoDate_Enabled = 1 ;
      edtChamadoDescricao_Enabled = 1 ;
      edtChamadoId_Jsonclick = "" ;
      edtChamadoId_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtChamadoDescricao_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Chamadoid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2ChamadoDescricao", A2ChamadoDescricao);
      httpContext.ajax_rsp_assign_attri("", false, "A3ChamadoCriacaoDate", localUtil.ttoc( A3ChamadoCriacaoDate, 10, 8, 0, 3, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4ChamadoResolucaoDate", localUtil.ttoc( A4ChamadoResolucaoDate, 10, 8, 0, 3, "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z1ChamadoId", GXutil.ltrim( localUtil.ntoc( Z1ChamadoId, (byte)(4), (byte)(0), ".", "")));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z2ChamadoDescricao", Z2ChamadoDescricao);
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z3ChamadoCriacaoDate", localUtil.ttoc( Z3ChamadoCriacaoDate, 10, 8, 0, 3, "/", ":", " "));
      com.sistemachamado.GxWebStd.gx_hidden_field( httpContext, "Z4ChamadoResolucaoDate", localUtil.ttoc( Z4ChamadoResolucaoDate, 10, 8, 0, 3, "/", ":", " "));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_CHAMADOID","{handler:'valid_Chamadoid',iparms:[{av:'A1ChamadoId',fld:'CHAMADOID',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_CHAMADOID",",oparms:[{av:'A2ChamadoDescricao',fld:'CHAMADODESCRICAO',pic:''},{av:'A3ChamadoCriacaoDate',fld:'CHAMADOCRIACAODATE',pic:'99/99/99 99:99'},{av:'A4ChamadoResolucaoDate',fld:'CHAMADORESOLUCAODATE',pic:'99/99/99 99:99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z1ChamadoId'},{av:'Z2ChamadoDescricao'},{av:'Z3ChamadoCriacaoDate'},{av:'Z4ChamadoResolucaoDate'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      sPrefix = "" ;
      Z2ChamadoDescricao = "" ;
      Z3ChamadoCriacaoDate = GXutil.resetTime( GXutil.nullDate() );
      Z4ChamadoResolucaoDate = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A2ChamadoDescricao = "" ;
      A3ChamadoCriacaoDate = GXutil.resetTime( GXutil.nullDate() );
      A4ChamadoResolucaoDate = GXutil.resetTime( GXutil.nullDate() );
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      T00014_A1ChamadoId = new short[1] ;
      T00014_A2ChamadoDescricao = new String[] {""} ;
      T00014_A3ChamadoCriacaoDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00014_A4ChamadoResolucaoDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00015_A1ChamadoId = new short[1] ;
      T00013_A1ChamadoId = new short[1] ;
      T00013_A2ChamadoDescricao = new String[] {""} ;
      T00013_A3ChamadoCriacaoDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00013_A4ChamadoResolucaoDate = new java.util.Date[] {GXutil.nullDate()} ;
      sMode1 = "" ;
      T00016_A1ChamadoId = new short[1] ;
      T00017_A1ChamadoId = new short[1] ;
      T00012_A1ChamadoId = new short[1] ;
      T00012_A2ChamadoDescricao = new String[] {""} ;
      T00012_A3ChamadoCriacaoDate = new java.util.Date[] {GXutil.nullDate()} ;
      T00012_A4ChamadoResolucaoDate = new java.util.Date[] {GXutil.nullDate()} ;
      T000111_A1ChamadoId = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ2ChamadoDescricao = "" ;
      ZZ3ChamadoCriacaoDate = GXutil.resetTime( GXutil.nullDate() );
      ZZ4ChamadoResolucaoDate = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.sistemachamado.chamado__default(),
         new Object[] {
             new Object[] {
            T00012_A1ChamadoId, T00012_A2ChamadoDescricao, T00012_A3ChamadoCriacaoDate, T00012_A4ChamadoResolucaoDate
            }
            , new Object[] {
            T00013_A1ChamadoId, T00013_A2ChamadoDescricao, T00013_A3ChamadoCriacaoDate, T00013_A4ChamadoResolucaoDate
            }
            , new Object[] {
            T00014_A1ChamadoId, T00014_A2ChamadoDescricao, T00014_A3ChamadoCriacaoDate, T00014_A4ChamadoResolucaoDate
            }
            , new Object[] {
            T00015_A1ChamadoId
            }
            , new Object[] {
            T00016_A1ChamadoId
            }
            , new Object[] {
            T00017_A1ChamadoId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000111_A1ChamadoId
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z1ChamadoId ;
   private short gxcookieaux ;
   private short AnyError ;
   private short IsModified ;
   private short IsConfirmed ;
   private short A1ChamadoId ;
   private short RcdFound1 ;
   private short ZZ1ChamadoId ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtChamadoId_Enabled ;
   private int edtChamadoDescricao_Enabled ;
   private int edtChamadoCriacaoDate_Enabled ;
   private int edtChamadoResolucaoDate_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtChamadoId_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtChamadoId_Jsonclick ;
   private String edtChamadoDescricao_Internalname ;
   private String edtChamadoCriacaoDate_Internalname ;
   private String edtChamadoCriacaoDate_Jsonclick ;
   private String edtChamadoResolucaoDate_Internalname ;
   private String edtChamadoResolucaoDate_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z3ChamadoCriacaoDate ;
   private java.util.Date Z4ChamadoResolucaoDate ;
   private java.util.Date A3ChamadoCriacaoDate ;
   private java.util.Date A4ChamadoResolucaoDate ;
   private java.util.Date ZZ3ChamadoCriacaoDate ;
   private java.util.Date ZZ4ChamadoResolucaoDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private String Z2ChamadoDescricao ;
   private String A2ChamadoDescricao ;
   private String ZZ2ChamadoDescricao ;
   private IDataStoreProvider pr_default ;
   private short[] T00014_A1ChamadoId ;
   private String[] T00014_A2ChamadoDescricao ;
   private java.util.Date[] T00014_A3ChamadoCriacaoDate ;
   private java.util.Date[] T00014_A4ChamadoResolucaoDate ;
   private short[] T00015_A1ChamadoId ;
   private short[] T00013_A1ChamadoId ;
   private String[] T00013_A2ChamadoDescricao ;
   private java.util.Date[] T00013_A3ChamadoCriacaoDate ;
   private java.util.Date[] T00013_A4ChamadoResolucaoDate ;
   private short[] T00016_A1ChamadoId ;
   private short[] T00017_A1ChamadoId ;
   private short[] T00012_A1ChamadoId ;
   private String[] T00012_A2ChamadoDescricao ;
   private java.util.Date[] T00012_A3ChamadoCriacaoDate ;
   private java.util.Date[] T00012_A4ChamadoResolucaoDate ;
   private short[] T000111_A1ChamadoId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class chamado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00012", "SELECT ChamadoId, ChamadoDescricao, ChamadoCriacaoDate, ChamadoResolucaoDate FROM Chamado WHERE ChamadoId = ?  FOR UPDATE OF Chamado NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00013", "SELECT ChamadoId, ChamadoDescricao, ChamadoCriacaoDate, ChamadoResolucaoDate FROM Chamado WHERE ChamadoId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00014", "SELECT TM1.ChamadoId, TM1.ChamadoDescricao, TM1.ChamadoCriacaoDate, TM1.ChamadoResolucaoDate FROM Chamado TM1 WHERE TM1.ChamadoId = ? ORDER BY TM1.ChamadoId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00015", "SELECT ChamadoId FROM Chamado WHERE ChamadoId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00016", "SELECT ChamadoId FROM Chamado WHERE ( ChamadoId > ?) ORDER BY ChamadoId  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00017", "SELECT ChamadoId FROM Chamado WHERE ( ChamadoId < ?) ORDER BY ChamadoId DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00018", "SAVEPOINT gxupdate;INSERT INTO Chamado(ChamadoId, ChamadoDescricao, ChamadoCriacaoDate, ChamadoResolucaoDate) VALUES(?, ?, ?, ?);RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T00019", "SAVEPOINT gxupdate;UPDATE Chamado SET ChamadoDescricao=?, ChamadoCriacaoDate=?, ChamadoResolucaoDate=?  WHERE ChamadoId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new UpdateCursor("T000110", "SAVEPOINT gxupdate;DELETE FROM Chamado  WHERE ChamadoId = ?;RELEASE SAVEPOINT gxupdate", GX_ROLLBACKSAVEPOINT + GX_NOMASK)
         ,new ForEachCursor("T000111", "SELECT ChamadoId FROM Chamado ORDER BY ChamadoId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setVarchar(2, (String)parms[1], 250, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 250, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
      }
   }

}


gx.evt.autoSkip=!1;gx.define("general.ui.masterprompt",!1,function(){this.ServerClass="general.ui.masterprompt";this.PackageName="com.sistemachamado";this.ServerFullClass="com.sistemachamado.general.ui.masterprompt";this.setObjectType("web");this.IsMasterPage=!0;this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.DSO="SISTEMA_CHAMADO";this.SetStandaloneVars=function(){};this.e12022_client=function(){return this.executeServerEvent("ENTER_MPAGE",!0,null,!1,!1)};this.e13022_client=function(){return this.executeServerEvent("CANCEL_MPAGE",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5];this.GXLastCtrlId=5;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};this.Events={e12022_client:["ENTER_MPAGE",!0],e13022_client:["CANCEL_MPAGE",!0]};this.EvtParms.REFRESH_MPAGE=[[],[]];this.EvtParms.ENTER_MPAGE=[[],[]];this.Initialize()});gx.wi(function(){gx.createMasterPage(general.ui.masterprompt)})
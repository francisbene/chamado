gx.evt.autoSkip=!1;gx.define("gx0010",!1,function(){var n,t;this.ServerClass="gx0010";this.PackageName="com.sistemachamado";this.ServerFullClass="com.sistemachamado.gx0010";this.setObjectType("web");this.anyGridBaseTable=!0;this.hasEnterEvent=!0;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.DSO="SISTEMA_CHAMADO";this.SetStandaloneVars=function(){this.AV9pChamadoId=gx.fn.getIntegerValue("vPCHAMADOID",".")};this.e12031_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class"),"AdvancedContainer")==0?(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer AdvancedContainerVisible"),gx.fn.setCtrlProperty("BTNTOGGLE","Class",gx.fn.getCtrlProperty("BTNTOGGLE","Class")+" BtnToggleActive")):(gx.fn.setCtrlProperty("ADVANCEDCONTAINER","Class","AdvancedContainer"),gx.fn.setCtrlProperty("BTNTOGGLE","Class","BtnToggle")),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e11031_client=function(){return this.clearMessages(),gx.text.compare(gx.fn.getCtrlProperty("CHAMADOIDFILTERCONTAINER","Class"),"AdvancedContainerItem")==0?(gx.fn.setCtrlProperty("CHAMADOIDFILTERCONTAINER","Class","AdvancedContainerItem AdvancedContainerItemExpanded"),gx.fn.setCtrlProperty("vCCHAMADOID","Visible",!0)):(gx.fn.setCtrlProperty("CHAMADOIDFILTERCONTAINER","Class","AdvancedContainerItem"),gx.fn.setCtrlProperty("vCCHAMADOID","Visible",!1)),this.refreshOutputs([{av:'gx.fn.getCtrlProperty("CHAMADOIDFILTERCONTAINER","Class")',ctrl:"CHAMADOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCHAMADOID","Visible")',ctrl:"vCCHAMADOID",prop:"Visible"}]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e15032_client=function(){return this.executeServerEvent("ENTER",!0,arguments[0],!1,!1)};this.e16031_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,45,46,47,48,49,50,51];this.GXLastCtrlId=51;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",44,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0010",[],!1,1,!1,!0,10,!0,!1,!1,"",0,"px",0,"px","Novo registro",!0,!1,!1,null,null,!1,"",!1,[1,1,1,1],!1,0,!0,!1);t=this.Grid1Container;t.addBitmap("&Linkselection","vLINKSELECTION",45,0,"px",17,"px",null,"","","SelectionAttribute","WWActionColumn");t.addSingleLineEdit(1,46,"CHAMADOID","Id","","ChamadoId","int",0,"px",4,4,"end",null,[],1,"ChamadoId",!0,0,!1,!1,"Attribute",0,"WWColumn");t.addSingleLineEdit(3,47,"CHAMADOCRIACAODATE","Criacao Date","","ChamadoCriacaoDate","dtime",0,"px",14,14,"end",null,[],3,"ChamadoCriacaoDate",!0,5,!1,!1,"Attribute",0,"WWColumn OptionalColumn");t.addSingleLineEdit(4,48,"CHAMADORESOLUCAODATE","Resolucao Date","","ChamadoResolucaoDate","dtime",0,"px",14,14,"end",null,[],4,"ChamadoResolucaoDate",!0,5,!1,!1,"Attribute",0,"WWColumn OptionalColumn");this.Grid1Container.emptyText="";this.setGrid(t);n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAIN",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"ADVANCEDCONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"CHAMADOIDFILTERCONTAINER",grid:0};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[12]={id:12,fld:"LBLCHAMADOIDFILTER",format:1,grid:0,evt:"e11031_client",ctrltype:"textblock"};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"",grid:0};n[16]={id:16,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCCHAMADOID",fmt:0,gxz:"ZV6cChamadoId",gxold:"OV6cChamadoId",gxvar:"AV6cChamadoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV6cChamadoId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.ZV6cChamadoId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("vCCHAMADOID",gx.O.AV6cChamadoId,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV6cChamadoId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("vCCHAMADOID",".")},nac:gx.falseFn};n[17]={id:17,fld:"",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"CHAMADOCRIACAODATEFILTERCONTAINER",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"",grid:0};n[22]={id:22,fld:"LBLCHAMADOCRIACAODATEFILTER",format:1,grid:0,ctrltype:"textblock"};n[23]={id:23,fld:"",grid:0};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"",grid:0};n[26]={id:26,lvl:0,type:"dtime",len:8,dec:5,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCCHAMADOCRIACAODATE",fmt:0,gxz:"ZV7cChamadoCriacaoDate",gxold:"OV7cChamadoCriacaoDate",gxvar:"AV7cChamadoCriacaoDate",dp:{f:-1,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV7cChamadoCriacaoDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV7cChamadoCriacaoDate=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCCHAMADOCRIACAODATE",gx.O.AV7cChamadoCriacaoDate,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV7cChamadoCriacaoDate=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("vCCHAMADOCRIACAODATE")},nac:gx.falseFn};n[27]={id:27,fld:"",grid:0};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"CHAMADORESOLUCAODATEFILTERCONTAINER",grid:0};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"LBLCHAMADORESOLUCAODATEFILTER",format:1,grid:0,ctrltype:"textblock"};n[33]={id:33,fld:"",grid:0};n[34]={id:34,fld:"",grid:0};n[35]={id:35,fld:"",grid:0};n[36]={id:36,lvl:0,type:"dtime",len:8,dec:5,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"vCCHAMADORESOLUCAODATE",fmt:0,gxz:"ZV8cChamadoResolucaoDate",gxold:"OV8cChamadoResolucaoDate",gxvar:"AV8cChamadoResolucaoDate",dp:{f:-1,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.AV8cChamadoResolucaoDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.ZV8cChamadoResolucaoDate=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("vCCHAMADORESOLUCAODATE",gx.O.AV8cChamadoResolucaoDate,0)},c2v:function(){this.val()!==undefined&&(gx.O.AV8cChamadoResolucaoDate=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("vCCHAMADORESOLUCAODATE")},nac:gx.falseFn};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"GRIDTABLE",grid:0};n[39]={id:39,fld:"",grid:0};n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"BTNTOGGLE",grid:0,evt:"e12031_client"};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[45]={id:45,lvl:2,type:"bits",len:1024,dec:0,sign:!1,ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vLINKSELECTION",fmt:0,gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.AV5LinkSelection=n)},v2z:function(n){n!==undefined&&(gx.O.ZV5LinkSelection=n)},v2c:function(n){gx.fn.setGridMultimediaValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(44),gx.O.AV5LinkSelection,gx.O.AV11Linkselection_GXI)},c2v:function(n){gx.O.AV11Linkselection_GXI=this.val_GXI();this.val(n)!==undefined&&(gx.O.AV5LinkSelection=this.val(n))},val:function(n){return gx.fn.getGridControlValue("vLINKSELECTION",n||gx.fn.currentGridRowImpl(44))},val_GXI:function(n){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",n||gx.fn.currentGridRowImpl(44))},gxvar_GXI:"AV11Linkselection_GXI",nac:gx.falseFn};n[46]={id:46,lvl:2,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CHAMADOID",fmt:0,gxz:"Z1ChamadoId",gxold:"O1ChamadoId",gxvar:"A1ChamadoId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A1ChamadoId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z1ChamadoId=gx.num.intval(n))},v2c:function(n){gx.fn.setGridControlValue("CHAMADOID",n||gx.fn.currentGridRowImpl(44),gx.O.A1ChamadoId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A1ChamadoId=gx.num.intval(this.val(n)))},val:function(n){return gx.fn.getGridIntegerValue("CHAMADOID",n||gx.fn.currentGridRowImpl(44),".")},nac:gx.falseFn};n[47]={id:47,lvl:2,type:"dtime",len:8,dec:5,sign:!1,ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CHAMADOCRIACAODATE",fmt:0,gxz:"Z3ChamadoCriacaoDate",gxold:"O3ChamadoCriacaoDate",gxvar:"A3ChamadoCriacaoDate",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A3ChamadoCriacaoDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z3ChamadoCriacaoDate=gx.fn.toDatetimeValue(n))},v2c:function(n){gx.fn.setGridControlValue("CHAMADOCRIACAODATE",n||gx.fn.currentGridRowImpl(44),gx.O.A3ChamadoCriacaoDate,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A3ChamadoCriacaoDate=gx.fn.toDatetimeValue(this.val(n)))},val:function(n){return gx.fn.getGridDateTimeValue("CHAMADOCRIACAODATE",n||gx.fn.currentGridRowImpl(44))},nac:gx.falseFn};n[48]={id:48,lvl:2,type:"dtime",len:8,dec:5,sign:!1,ro:1,isacc:0,grid:44,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CHAMADORESOLUCAODATE",fmt:0,gxz:"Z4ChamadoResolucaoDate",gxold:"O4ChamadoResolucaoDate",gxvar:"A4ChamadoResolucaoDate",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(n){n!==undefined&&(gx.O.A4ChamadoResolucaoDate=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z4ChamadoResolucaoDate=gx.fn.toDatetimeValue(n))},v2c:function(n){gx.fn.setGridControlValue("CHAMADORESOLUCAODATE",n||gx.fn.currentGridRowImpl(44),gx.O.A4ChamadoResolucaoDate,0)},c2v:function(n){this.val(n)!==undefined&&(gx.O.A4ChamadoResolucaoDate=gx.fn.toDatetimeValue(this.val(n)))},val:function(n){return gx.fn.getGridDateTimeValue("CHAMADORESOLUCAODATE",n||gx.fn.currentGridRowImpl(44))},nac:gx.falseFn};n[49]={id:49,fld:"",grid:0};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"BTN_CANCEL",grid:0,evt:"e16031_client"};this.AV6cChamadoId=0;this.ZV6cChamadoId=0;this.OV6cChamadoId=0;this.AV7cChamadoCriacaoDate=gx.date.nullDate();this.ZV7cChamadoCriacaoDate=gx.date.nullDate();this.OV7cChamadoCriacaoDate=gx.date.nullDate();this.AV8cChamadoResolucaoDate=gx.date.nullDate();this.ZV8cChamadoResolucaoDate=gx.date.nullDate();this.OV8cChamadoResolucaoDate=gx.date.nullDate();this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z1ChamadoId=0;this.O1ChamadoId=0;this.Z3ChamadoCriacaoDate=gx.date.nullDate();this.O3ChamadoCriacaoDate=gx.date.nullDate();this.Z4ChamadoResolucaoDate=gx.date.nullDate();this.O4ChamadoResolucaoDate=gx.date.nullDate();this.AV6cChamadoId=0;this.AV7cChamadoCriacaoDate=gx.date.nullDate();this.AV8cChamadoResolucaoDate=gx.date.nullDate();this.AV9pChamadoId=0;this.AV5LinkSelection="";this.A1ChamadoId=0;this.A3ChamadoCriacaoDate=gx.date.nullDate();this.A4ChamadoResolucaoDate=gx.date.nullDate();this.Events={e15032_client:["ENTER",!0],e16031_client:["CANCEL",!0],e12031_client:["'TOGGLE'",!1],e11031_client:["LBLCHAMADOIDFILTER.CLICK",!1]};this.EvtParms.REFRESH=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cChamadoId",fld:"vCCHAMADOID",pic:"ZZZ9"},{av:"AV7cChamadoCriacaoDate",fld:"vCCHAMADOCRIACAODATE",pic:"99/99/99 99:99"},{av:"AV8cChamadoResolucaoDate",fld:"vCCHAMADORESOLUCAODATE",pic:"99/99/99 99:99"}],[]];this.EvtParms["'TOGGLE'"]=[[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("ADVANCEDCONTAINER","Class")',ctrl:"ADVANCEDCONTAINER",prop:"Class"},{ctrl:"BTNTOGGLE",prop:"Class"}]];this.EvtParms["LBLCHAMADOIDFILTER.CLICK"]=[[{av:'gx.fn.getCtrlProperty("CHAMADOIDFILTERCONTAINER","Class")',ctrl:"CHAMADOIDFILTERCONTAINER",prop:"Class"}],[{av:'gx.fn.getCtrlProperty("CHAMADOIDFILTERCONTAINER","Class")',ctrl:"CHAMADOIDFILTERCONTAINER",prop:"Class"},{av:'gx.fn.getCtrlProperty("vCCHAMADOID","Visible")',ctrl:"vCCHAMADOID",prop:"Visible"}]];this.EvtParms.ENTER=[[{av:"A1ChamadoId",fld:"CHAMADOID",pic:"ZZZ9",hsh:!0}],[{av:"AV9pChamadoId",fld:"vPCHAMADOID",pic:"ZZZ9"}]];this.EvtParms.GRID1_FIRSTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cChamadoId",fld:"vCCHAMADOID",pic:"ZZZ9"},{av:"AV7cChamadoCriacaoDate",fld:"vCCHAMADOCRIACAODATE",pic:"99/99/99 99:99"},{av:"AV8cChamadoResolucaoDate",fld:"vCCHAMADORESOLUCAODATE",pic:"99/99/99 99:99"}],[]];this.EvtParms.GRID1_PREVPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cChamadoId",fld:"vCCHAMADOID",pic:"ZZZ9"},{av:"AV7cChamadoCriacaoDate",fld:"vCCHAMADOCRIACAODATE",pic:"99/99/99 99:99"},{av:"AV8cChamadoResolucaoDate",fld:"vCCHAMADORESOLUCAODATE",pic:"99/99/99 99:99"}],[]];this.EvtParms.GRID1_NEXTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cChamadoId",fld:"vCCHAMADOID",pic:"ZZZ9"},{av:"AV7cChamadoCriacaoDate",fld:"vCCHAMADOCRIACAODATE",pic:"99/99/99 99:99"},{av:"AV8cChamadoResolucaoDate",fld:"vCCHAMADORESOLUCAODATE",pic:"99/99/99 99:99"}],[]];this.EvtParms.GRID1_LASTPAGE=[[{av:"GRID1_nFirstRecordOnPage"},{av:"GRID1_nEOF"},{ctrl:"GRID1",prop:"Rows"},{av:"AV6cChamadoId",fld:"vCCHAMADOID",pic:"ZZZ9"},{av:"AV7cChamadoCriacaoDate",fld:"vCCHAMADOCRIACAODATE",pic:"99/99/99 99:99"},{av:"AV8cChamadoResolucaoDate",fld:"vCCHAMADORESOLUCAODATE",pic:"99/99/99 99:99"}],[]];this.setVCMap("AV9pChamadoId","vPCHAMADOID",0,"int",4,0);t.addRefreshingParm({rfrProp:"Rows",gxGrid:"Grid1"});t.addRefreshingVar(this.GXValidFnc[16]);t.addRefreshingVar(this.GXValidFnc[26]);t.addRefreshingVar(this.GXValidFnc[36]);t.addRefreshingParm(this.GXValidFnc[16]);t.addRefreshingParm(this.GXValidFnc[26]);t.addRefreshingParm(this.GXValidFnc[36]);this.Initialize()});gx.wi(function(){gx.createParentObj(this.gx0010)})
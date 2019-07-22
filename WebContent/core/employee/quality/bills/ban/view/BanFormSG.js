Ext.define("core.employee.quality.bills.ban.view.BanFormSG", {
			extend: 'Ext.form.Panel',
			alias: 'widget.BanFormSG',
			autoScroll:true,
			layout :'column',
	    //    layout:'vbox',
	
		tbar:[{xtype: 'button', text: '质量事故保存',ref:'save',formBind : true},
			  {xtype: 'button', text: '重置',ref:'reset'},
			  {xtype: 'button', text: '关闭',ref:'close'}
		],
			
		items:[				
						{xtype: 'textfield',name:'uuid', hidden: true},
						{xtype: 'textfield',name:'type', value :'0',hidden: true},
						{xtype: 'textfield',name:'ts', hidden: true,value: '2017-05-06 13:24:01'},
						{xtype: 'numberfield',name:'totalmulct',value:0,hidden: true},
						{xtype: 'numberfield',name:'totalreward',value:0,hidden: true},
						{xtype: 'textfield', fieldLabel: '单据号:',margin: '5 40 0 20',name:'billcode',allowBlank :false,columnWidth: 0.5},						
						{xtype: 'textfield', fieldLabel: '事故标题:',margin: '5 40 0 20',name:'billhead',allowBlank :false,columnWidth: 0.5},
						{xtype: 'ProjectCombo', fieldLabel: '项目号:',margin: '5 40 0 20',name:'project',allowBlank :false,columnWidth: 0.5},
						{xtype: 'textfield', fieldLabel: '项目对象:',margin: '5 40 0 20',name:'projectobj',allowBlank :false,columnWidth: 0.5},
						{xtype: 'DeptCombo', fieldLabel: '主责部门:',margin: '5 40 0 20',name:'dept',allowBlank :false,columnWidth: 0.5},
						{xtype: 'DeptCombo', fieldLabel: '外协单位:',margin: '5 40 0 20',name:'wbdept',allowBlank :false,columnWidth: 0.5},
						{xtype: 'datefield', fieldLabel: '发生日期:',margin: '5 40 0 20',name:'createdate',allowBlank :false,columnWidth: 0.5,format: 'Y-m-d',maxValue: new Date()},						
						{xtype: 'textfield',fieldLabel: '整改意见书编号:',margin: '5 40 0 20',name:'panding',allowBlank :false,columnWidth: 0.5},
						{xtype: 'htmleditor',fieldLabel: '事故描述:',margin: '5 40 0 20',name:'miaoshu',columnWidth: 1},
					    {xtype: 'UploadFieldDef',fieldLabel: '图片一:',name: 'image1',margin:'5 40 0 20',contexType:'image',filepath :'/upload/image',columnWidth: 0.5},	
					 	{xtype: 'UploadFieldDef',fieldLabel: '图片二:',name: 'image2',margin: '5 40 0 20',contexType:'image',filepath :'/upload/image',columnWidth: 0.5},
					//	{xtype: 'htmleditor',fieldLabel:'事故分析',name:'fenxi',margin: '5 40 0 20',columnWidth: 1,enableFont :false},
						{xtype: 'combo',fieldLabel: '处罚依据:',columnWidth: 1,margin: '5 40 0 20',name:'yiju',store:"core.employee.quality.bills.ban.store.QualityForbidtypeStore",queryMode: 'local',valueField: 'typename',displayField: 'typename', editable : false,allowBlank :false},
						{xtype: 'htmleditor',fieldLabel:'整改要求',name:'fangfa',margin: '5 40 10 20',columnWidth: 1,enableSourceEdit :false},
				//		{xtype: 'textfield',margin: '5 40 10 20',columnWidth: 1}
				],

			
		initComponent : function() {
				this.callParent(arguments);
			}
			
})
Ext.define("core.employee.quality.bills.banApprove.view.BanApproveSearchForm", {
			extend: 'Ext.form.Panel',
			alias: 'widget.BanApproveSearchForm',
			layout :'form',
			bodyPadding : 10,
			defaults: { // defaults are applied to items, not the container
				margin  : '15 10 15 10',
			},
			
	
		bbar:[
			   { xtype: 'button', text: '查询',ref:'search',formBind : true},
			   { xtype: 'button', text: '重置',ref:'reset'}
		],
			
		items:[
				
				{xtype: 'datefield', fieldLabel: '开始时间:',name:'begindate',format: 'Y-m-d',maxValue: new Date()},
				{xtype: 'datefield', fieldLabel: '结束时间:',name:'enddate',format: 'Y-m-d',maxValue: new Date()},
				{xtype: 'ResourceCombo',name:'resourceid', fieldLabel: '单据类型:',allowBlank :false},
				{xtype: 'textfield', fieldLabel: '单据号:',name:'billcode'},
				{xtype: 'textfield', fieldLabel: '事故标题:',name:'billhead'},
				
			],

			
		initComponent : function() {
				this.callParent(arguments);
			}
			
})
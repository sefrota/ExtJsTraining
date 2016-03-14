/**
 * Created by sletras on 11/03/2016.
 */
Ext.define('ExtJsTraining.view.main.Profile', {
    extend: 'Ext.form.Panel',
    xtype: 'profile',

    requires: [
        'Ext.form.FieldSet',
        'Ext.layout.container.VBox'
    ],

    bodyPadding: 5,
    layout: {type: 'vbox', align: 'middle'},
    title: 'Hello Panel',
    header: true,
    defaultType: 'textfield',
    buttonAlign: 'left',
    height: 500,
    width: 310,
    renderTo: Ext.getBody(),
    items: [{
        xtype: 'image',
        fieldLabel: 'Image',
        src: 'http://kazete.com.tr/img/blogger/0.png',
        width: 250,
        height: 250,
    }, {
        xtype: 'fieldset',
        title: 'User Info',
        defaultType: 'textfield',
        name: 'userInfo',
        items: [
            {allowBlank: false, fieldLabel: 'User ID', name: 'userId', emptyText: 'user id'},
            {allowBlank: false, fieldLabel: 'Password', name: 'password', emptyText: 'password', inputType: 'password'},
            {allowBlank: false, fieldLabel: 'Verify', name: 'password', emptyText: 'password', inputType: 'password'}
        ]
    }, {
        xtype: 'fieldset',
        title: 'Contact Information',
        name: 'contactInfo',
        defaultType: 'textfield',

        items: [{
            fieldLabel: 'First Name',
            emptyText: 'First Name',
            name: 'firstName'
        }, {
            fieldLabel: 'Last Name',
            emptyText: 'Last Name',
            name: 'lastName'
        }, {
            fieldLabel: 'Company',
            name: 'company'
        }, {
            fieldLabel: 'Email',
            name: 'email',
            vtype: 'email'
        }, {
            xtype: 'combobox',
            fieldLabel: 'Country',
            name: 'country',
            typeAhead: true,
            queryMode: 'local',
            emptyText: 'Select a country...'
        }, {
            xtype: 'datefield',
            fieldLabel: 'Date of Birth',
            name: 'dateOfBirth',
            allowBlank: false,
            maxValue: new Date()
        }],
    }, {
        text: 'Save / Update',
        xtype: 'button',
        formBind: true,
        disabled: false,
    }]
});
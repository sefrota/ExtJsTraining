/**
 * This view is an example list of people.
 */
Ext.define('ExtJsTraining.view.main.List', {
    extend: 'Ext.grid.Panel',
    xtype: 'mainlist',

    requires: [
        'ExtJsTraining.store.Personnel'
    ],

    title: 'Personnel',
    height: 1000,
    store: {
        type: 'personnel',
    },

    columns: [
        { text: 'User Id',  dataIndex: 'userId'},
        { text: 'First Name', dataIndex: 'firstName', flex: 1 },
        { text: 'Last Name', dataIndex: 'lastName', flex: 1 },
        { text: 'Email', dataIndex: 'email', flex: 1 }
    ],

    listeners: {
        select: 'onItemSelectedTeste'
    }
});

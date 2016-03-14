Ext.define('ExtJsTraining.store.Personnel', {
    extend: 'Ext.data.Store',
    requires: [
        'Ext.data.proxy.Rest',
        'ExtJsTraining.model.User'
    ],
    alias: 'store.personnel',
    model: 'ExtJsTraining.model.User',
    fields: [
        'userId', 'password', 'firstName', 'lastName', 'company',
        'email', 'email', 'country', 'dateOfBirth', 'profilePicUrl'
    ],


    proxy: {
        type: 'rest',
        url: 'http://localhost:8080/people',
        reader: {
            type: 'json',
            rootProperty: 'people'
        }
    },

    autoLoad: true
});

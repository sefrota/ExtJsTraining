/**
 * This class is the main view for the application. It is specified in app.js as the
 * "mainView" property. That setting automatically applies the "viewport"
 * plugin causing this view to become the body element (i.e., the viewport).
 *
 * TODO - Replace this content of this view to suite the needs of your application.
 */
Ext.define('ExtJsTraining.view.main.Main', {
    extend: 'Ext.tab.Panel',
    xtype: 'app-main',

    requires: [
        'Ext.layout.container.Column',
        'Ext.panel.Panel',
        'Ext.plugin.Viewport',
        'Ext.window.MessageBox',
        'ExtJsTraining.view.main.List',
        'ExtJsTraining.view.main.MainController',
        'ExtJsTraining.view.main.MainModel',
        'ExtJsTraining.view.main.Profile'
    ],

    controller: 'main',
    viewModel: 'main',

    ui: 'navigation',

    tabBarHeaderPosition: 1,
    titleRotation: 0,
    tabRotation: 0,

    header: {
        layout: {
            align: 'stretchmax'
        },
        title: {
            bind: {
                text: '{name}'
            },
            flex: 0
        },
        iconCls: 'fa-th-list'
    },

    tabBar: {
        flex: 1,
        layout: {
            align: 'stretch',
            overflowHandler: 'none'
        }
    },

    responsiveConfig: {
        tall: {
            headerPosition: 'top'
        },
        wide: {
            headerPosition: 'left'
        }
    },

    defaults: {
        bodyPadding: 20,
        tabConfig: {
            plugins: 'responsive',
            responsiveConfig: {
                wide: {
                    iconAlign: 'left',
                    textAlign: 'left'
                },
                tall: {
                    iconAlign: 'top',
                    textAlign: 'center',
                    width: 120
                }
            }
        }
    },

    items: [{
        title: 'Home',
        iconCls: 'fa-home',
        // The following grid shares a store with the classic version's grid as well!
        items: [
            {
                xtype: 'panel',
                layout: 'border',
                height: 1000,
                items: [{
                    xtype: 'mainlist',
                    region: 'center',
                    margin: '0 5 0 0'
                }, {
                    xtype: 'profile',
                    reference: 'profile',
                    region: 'east',
                    collapsible: true
                }]
            }
        ]
    }, {
        title: 'Users',
        iconCls: 'fa-user',
        items: [
            {
                xtype: 'panel',
                layout: 'border',
                height: 1000,
                items: [{
                    xtype: 'mainlist',
                    region: 'center',
                    margin: '0 5 0 0'
                }, {
                    xtype: 'profile',
                    region: 'east',
                    collapsible: true
                }]
            }
        ]
    }, {
        title: 'Groups',
        iconCls: 'fa-users',
        bind: {
            html: '{loremIpsum}'
        }
    }, {
        title: 'Settings',
        iconCls: 'fa-cog',
        bind: {
            html: '{loremIpsum}'
        }
    }]
});

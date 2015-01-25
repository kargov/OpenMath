'use strict';

angular.module('openMath', ['ngResource','ui.router','openMath.controllers', 'openMath.services'])

.config(function($stateProvider, $urlRouterProvider,$httpProvider) {
  $stateProvider
    // setup an abstract state for the tabs directive
    .state('home', {
      url: "/home",
      controller: 'HomeCtrl',
      templateUrl: "templates/home.html"
    });

  // if none of the above states are matched, use this as the fallback
  $urlRouterProvider.otherwise('/home');

  /* CORS... */
  /* http://stackoverflow.com/questions/17289195/angularjs-post-data-to-external-rest-api */
  $httpProvider.defaults.useXDomain = true;
  delete $httpProvider.defaults.headers.common['X-Requested-With'];

});


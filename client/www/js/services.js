var services = angular.module('openMath.services', ['ngResource']);

var baseUrl = 'http://localhost\\:8088';

services.factory('ProjectsService', function ($resource) {
    return $resource(baseUrl + '/api/projects', {}, {
         query: { method: 'GET', isArray: true }
     });
 });

 services.factory('ProjectService', function ($resource) {
     return $resource(baseUrl + '/api/project', {}, {
          query: { method: 'GET', isArray: false, params: {id: '@id'}},
          create: { method: 'POST', params: {name: '@name'} },
          remove: { method: 'DELETE',params: {id: '@id'} }
      });
  });
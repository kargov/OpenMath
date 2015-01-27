angular.module('openMath.controllers', ['ngResource'])

.controller('HomeCtrl',['$rootScope','$scope','$location','ProjectsService','ProjectService', function ($rootScope,$scope, $location, ProjectsService, ProjectService) {
      $scope.projects = ProjectsService.query();

      $scope.addProject = function() {
            var project = {
                  name: 'New Project',
            };
            ProjectService.create(project);
            $scope.projects.push(project);
      };

      $scope.removeProject = function(array, index){
          var removedProject = array.splice(index, 1);
          var projectId = {
               id: removedProject[0].id,
          };
          ProjectService.remove(projectId);
      }

      $scope.openProject = function(project) {
          $rootScope.selectedProject = project;
          $location.path( "/project" );
       };

}])

.controller('ProjectCtrl',['$rootScope','$scope','ProjectService', function ($rootScope, $scope, ProjectService) {
      var project = ProjectService.query($rootScope.selectedProject);
      project.$promise.then(function(data) {
         $scope.name = data.name;
      });
}]);

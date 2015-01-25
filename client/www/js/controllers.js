angular.module('openMath.controllers', ['ngResource'])

.controller('HomeCtrl',['$scope','ProjectsService', 'ProjectService', function ($scope, ProjectsService, ProjectService) {
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

          var project = {
               id: removedProject[0].id,
          };

          ProjectService.remove(project);
      }
}]);

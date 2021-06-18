let Tasks = [];
let Teams = [];
let Employees = [];

document.getElementById("submit_task").addEventListener("click", add_task);
document.getElementById("submit_user").addEventListener("click", add_user);
function add_task(){
  var submitted_task = document.getElementById("The_New_task").value;
  Tasks.push(submitted_task);
  var paragraph = document.getElementById("Plannertasks");
  var task_identify = document.createTextNode(submitted_task);
  var linebreak = document.createElement("br");
  paragraph.appendChild(task_identify);
  paragraph.appendChild(linebreak);
}
function add_user(){
  var submitted_user = document.getElementById("The_New_Username").value;
  Employees.push(submitted_user);
  var paragraph = document.getElementById("Planneremployee");
  var user_identify = document.createTextNode(submitted_user);
  var linebreak = document.createElement("br");
  paragraph.appendChild(user_identify);
  paragraph.appendChild(linebreak);
}
Tasks.forEach(function(item) {
  var paragraph = document.getElementById("Plannertasks");
  var task_identify = document.createTextNode(item);
  var linebreak = document.createElement("br");
  paragraph.appendChild(task_identify);
  paragraph.appendChild(linebreak);
})
Employees.forEach(function(item) {
  var paragraph = document.getElementById("Planneremployee");
  var employee_identify = document.createTextNode(item);
  var linebreak = document.createElement("br");
  paragraph.appendChild(employee_identify);
  paragraph.appendChild(linebreak);
})
Teams.forEach(function(item) {
  var paragraph = document.getElementById("Teamlist");
  var team_identify = document.createTextNode(item);
  var linebreak = document.createElement("br");
  paragraph.appendChild(team_identify);
  paragraph.appendChild(linebreak);
  Employees.forEach(function(item) {
    var employee_identify = document.createTextNode(item);
    paragraph.appendChild(employee_identify);
  })
  var linebreak = document.createElement("br");
  paragraph.appendChild(linebreak);
  var paragraph = document.getElementById("Teamlist");
  var team_identify = document.createTextNode(item);
  var linebreak = document.createElement("br");
  paragraph.appendChild(team_identify);
  paragraph.appendChild(linebreak);
  Tasks.forEach(function(item) {
    var employee_identify = document.createTextNode(item);
    paragraph.appendChild(employee_identify);
  })
  var linebreak = document.createElement("br");
  paragraph.appendChild(linebreak);
  var linebreak = document.createElement("br");
  paragraph.appendChild(linebreak);
})

let Tasks = ['clean your dam computer jerold ' ,'design logo ','write javascript code '];

function add_task(){
  Tasks.push("new task")
}

var paragraph = document.getElementById("Plannertasks");
var linebreak = document.createElement("br");
Tasks.forEach(function(item, index, array) {
  var task_identify = document.createTextNode(item);
  paragraph.appendChild(task_identify);
  paragraph.appendChild(linebreak);
})

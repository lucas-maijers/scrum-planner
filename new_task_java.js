let Tasks = ['clean your dam computer jerold ' ,'design logo ','write javascript code '];

var submitted_task = document.getElementById("Newtask");

function add_task(){
  Tasks.push(submitted_task)
}

var paragraph = document.getElementById("Plannertasks");

Tasks.forEach(function(item, index) {
  var task_identify = document.createTextNode(item);
  var linebreak = document.createElement("br");
  paragraph.appendChild(task_identify);
  paragraph.appendChild(linebreak);
})

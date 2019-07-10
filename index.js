const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");
const app = express();

//Configure the express instance
app.use(bodyParser.urlencoded({ extended: true }));
app.use(cors());
app.use(bodyParser.json());

//Student List
var students = ["Yash Mehrotra", "Shashank Jaitly"];

app.post("/add", (req, res) => {
  const student = req.body.name;
  students.push(student);
  res.json({ students });
});

app.get("/all", (req, res) => {
  res.json({ students });
});

app.listen(3000, err => {
  if (err) throw err;
  console.log("Server serving at port 3000");
});

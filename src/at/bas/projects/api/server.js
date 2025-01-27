const express = require("express")
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json());

const port = 3000;

const data = [
    { name: "hans", age: 17 },
    { name: "paul", age: 17 },
    { name: "seppl", age: 17 },
    { name: "peter", age: 17 },
];

app.get("/people", (req, res) => {
    res.send(data);
})

app.get("/people/:id", (req, res) => {
    let id = req.params.id;
    res.send(data[id]);
})

app.delete("/people/:id", (req, res) => {
    let id = req.params.id;
    data.splice(id, 1);
    res.send("done");
})

app.post("/people", (req, res) => {
    data.push(req.body);

    res.send(req.body);
})

app.get("/", (req, res) => {
    res.send("I am here");
})

app.listen(port, () => {
    console.log("Server running on port " + port)
})
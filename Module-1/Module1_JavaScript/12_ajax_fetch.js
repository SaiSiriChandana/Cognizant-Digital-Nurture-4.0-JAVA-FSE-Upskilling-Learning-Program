const data = { name: "John Doe", event: "Tech Meetup" };
fetch("https://mockapi.com/register", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(data)
})
  .then(res => res.json())
  .then(data => console.log("Registered", data))
  .catch(err => console.error(err));
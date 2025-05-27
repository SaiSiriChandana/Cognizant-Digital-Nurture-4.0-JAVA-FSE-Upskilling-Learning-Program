document.getElementById("registerBtn").onclick = () => alert("Registered!");
document.getElementById("categorySelect").onchange = e => console.log(e.target.value);
document.addEventListener("keydown", e => {
  if (e.key === "Enter") console.log("Search Triggered");
});
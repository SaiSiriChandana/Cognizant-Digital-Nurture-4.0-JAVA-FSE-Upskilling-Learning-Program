document.getElementById("regForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.name.value;
  if (!name) {
    alert("Name is required");
  } else {
    console.log("Form submitted", name);
  }
});
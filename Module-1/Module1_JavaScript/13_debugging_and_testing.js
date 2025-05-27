console.log("Start registration");
try {
  const result = await fetch("https://mockapi.com/register");
  const json = await result.json();
  console.log(json);
} catch (e) {
  console.error("Registration failed", e);
}
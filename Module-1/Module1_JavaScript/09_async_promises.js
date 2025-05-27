fetch("https://mockapi.com/events")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error(err));

async function loadEvents() {
  try {
    const res = await fetch("https://mockapi.com/events");
    const data = await res.json();
    console.log(data);
  } catch (err) {
    console.error(err);
  }
}
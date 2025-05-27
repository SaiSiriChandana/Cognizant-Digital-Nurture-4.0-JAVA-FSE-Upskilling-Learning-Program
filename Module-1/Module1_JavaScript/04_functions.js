function addEvent(title, category) {
  return { title, category, registered: 0 };
}
function registerUser(event) {
  event.registered++;
}
function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}
const categoryTracker = (() => {
  let count = 0;
  return () => ++count;
})();

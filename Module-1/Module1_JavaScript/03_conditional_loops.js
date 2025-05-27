const events = [
  { title: "AI Conf", date: "2025-05-01", seats: 0 },
  { title: "Web Summit", date: "2025-06-10", seats: 20 }
];
events.forEach(e => {
  if (new Date(e.date) > new Date() && e.seats > 0) {
    console.log(`Available: ${e.title}`);
  }
});
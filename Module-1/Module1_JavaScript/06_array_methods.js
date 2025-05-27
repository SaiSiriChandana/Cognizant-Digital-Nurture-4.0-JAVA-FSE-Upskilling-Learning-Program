const eventList = [];
eventList.push({ title: "Music Night", category: "music" });
const musicEvents = eventList.filter(e => e.category === "music");
const eventTitles = eventList.map(e => `Event: ${e.title}`);
console.log(eventTitles);
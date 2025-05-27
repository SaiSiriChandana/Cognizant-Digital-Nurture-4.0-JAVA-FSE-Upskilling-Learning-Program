function greet(name = "Guest") {
  console.log(`Hello, ${name}`);
}
const eventObj = { title: "JSConf", date: "2025-07-01" };
const { title, date } = eventObj;
const clone = { ...eventObj, location: "NY" };
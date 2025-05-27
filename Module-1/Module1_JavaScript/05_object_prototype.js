function CommunityEvent(title, seats) {
  this.title = title;
  this.seats = seats;
}

CommunityEvent.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const myEvent = new CommunityEvent("DevCon", 10);
console.log(myEvent.checkAvailability()); // true

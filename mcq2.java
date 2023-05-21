let questionsFormEl = document.getElementById("questionsForm");
let cityHyderabadEl = document.getElementById("cityHyderabad");
let cityChennaiEl = document.getElementById("cityChennai");
let cityDelhiEl = document.getElementById("cityDelhi");
let cityMumbaiEl = document.getElementById("cityMumbai");
let submitBtnEl = document.getElementById("submitBtn");
let resultMsgEl = document.getElementById("resultMsg");
let messageEl = "";

questionsFormEl.addEventListener("submit", function(event) {
    event.preventDefault();
});

cityHyderabadEl.addEventListener("change", function(event) {
    messageEl = event.target.value;
});

cityMumbaiEl.addEventListener("change", function(event) {
    messageEl = event.target.value;
});

cityDelhiEl.addEventListener("change", function(event) {
    messageEl = event.target.value;
});

cityChennaiEl.addEventListener("change", function(event) {
    messageEl = event.target.value;
});

function startUp() {
    if (messageEl === "") {
        resultMsgEl.textContent = "Please select the answer!";
        resultMsgEl.classList.add("wrongmess");
    } else if (messageEl === "Delhi") {
        resultMsgEl.textContent = "Correct answer!";
        resultMsgEl.classList.add("rightmess");
    } else {
        resultMsgEl.textContent = "Wrong answer!";
        resultMsgEl.classList.add("wrongmess");
    }
}

submitBtnEl.addEventListener("click", startUp);
function validateForm() {
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value;
  const website = document.getElementById("website").value.trim();
  const terms = document.getElementById("terms").checked;
  const country = document.getElementById("country").value;
  const messageBox = document.getElementById("message");

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const passwordRegex = /^(?=.*[A-Z])(?=.*[0-9])(?=.*[\W_]).{8,}$/;
  const urlRegex = /^(https?:\/\/)?([\w-]+)\.([a-z]{2,6})([\/\w\-._]*)*\/?$/;

  messageBox.style.display = "block";

  if (!name) {
    showMessage("Name is required", "error");
    return false;
  }
  if (!emailRegex.test(email)) {
    showMessage("Invalid email format", "error");
    return false;
  }
  if (!passwordRegex.test(password)) {
    showMessage(
      "Password must be at least 8 characters, with 1 uppercase, 1 number, and 1 special symbol",
      "error"
    );
    return false;
  }
  if (!country) {
    showMessage("Please select a country", "error");
    return false;
  }
  if (website && !urlRegex.test(website)) {
    showMessage("Invalid portfolio URL", "error");
    return false;
  }
  if (!terms) {
    showMessage("You must agree to the terms", "error");
    return false;
  }

  showMessage("Form submitted successfully!", "success");
  return false; // Prevent actual form submission
}

function showMessage(msg, type) {
  const messageBox = document.getElementById("message");
  messageBox.textContent = msg;
  messageBox.className = `message ${type}`;
}

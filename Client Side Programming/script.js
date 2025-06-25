function validateForm() {
  const name = document.getElementById("name").value.trim();
  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value;
  const messageBox = document.getElementById("message");
  messageBox.style.display = "block";

  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const passwordRegex =
    /^(?=.*[A-Z])(?=.*[0-9])(?=.*[\W_]).{8,}$/;

  if (name === "") {
    showMessage("Name cannot be empty", "error");
  } else if (!emailRegex.test(email)) {
    showMessage("Invalid email address", "error");
  } else if (!passwordRegex.test(password)) {
    showMessage(
      "Password must be at least 8 characters long, include 1 uppercase letter, 1 number, and 1 special character",
      "error"
    );
  } else {
    showMessage("Form submitted successfully!", "success");
  }
}

function showMessage(msg, type) {
  const messageBox = document.getElementById("message");
  messageBox.textContent = msg;
  messageBox.className = `message ${type}`;
}

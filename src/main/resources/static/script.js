async function convert(mode) {
  const text = document.getElementById("inputText").value;

  const response = await fetch("http://localhost:8080/convert", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({ text: text, mode: mode })
  });

  const data = await response.json();
  document.getElementById("resultText").value = data.convertedText;

}


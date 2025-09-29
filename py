from flask import Flask, request, render_template
from google import genai
import os 

app = Flask (__name__)
client = genai.Client(api_key="")

@app.route("/", methods=["GET","POST"])
def index():
    resposta= ""
    if request.method == "POST":
        prompt = request.form.get("mensagem","")

        response = client.models.generate_content(
            model = "gemini-2,5-flash",
            constents = prompt,
        )

  resposta = response.text 
return render_template("index.html", resposta = resposta )

if __name__=="_main_":
    app.run(debug=true) 

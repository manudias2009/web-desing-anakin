from flask import Flask,request, send_file, render_template,jsonify

app = Flask(__name__)

@app.route("/")
def index():
    return send_file('index.html')

@app.route("/perguntar_nome.html")
def perguntar_nome():
    return send_file ('perguntar_nome.html')

if __name__ == "__main__":
    app.run(debug=True, host='127.0.0.1',port=5000)
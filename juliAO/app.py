from google import genai

client = genai.Client(api_key="SUA_CHAVE_AQUI")

def gerar_historia(cenario, escolha=None):
    if escolha:
        prompt = f"Continue uma história interativa no cenário '{cenario}', considerando a escolha do jogador: {escolha}. Mantenha o texto em português e interessante."
    else:
        prompt = f"Crie o início de uma história interativa no cenário '{cenario}'. Dê ao jogador algumas opções de escolha no final da narrativa."

    response = client.models.generate_content(
        model="gemini-2.5-flash",
        contents=prompt
    )
    return response.text

def jogo_aventura():
    print("🎮 Bem-vindo ao Gerador de Aventuras Interativas")
    cenario = input("Escolha o cenário (fantasia, sci-fi, mistério, etc): ")

    historia = gerar_historia(cenario)
    print("\n📖 História:\n")
    print(historia)

    while True:
        escolha = input("\nDigite sua escolha (ou 'sair' para encerrar): ")
        if escolha.lower() == "sair":
            print("👋 Fim da aventura.")
            break
        historia = gerar_historia(cenario, escolha)
        print("\n📖 Continuação:\n")
        print(historia)

jogo_aventura()
 
            
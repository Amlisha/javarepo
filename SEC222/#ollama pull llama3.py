#ollama pull llama3


import requests

def chat_with_ollama(prompt, history):
    # Format conversation as text
    conversation =""
    for role, message in history:
        conversation += f"{role}: {message}\n"
        conversation += f"user: {prompt}\nassistant:"

    response = requests.post(
            "http://localhost:11434/api/generate",
            json={"model": "llama3", "prompt": conversation, "stream": False}
        )

    return response.json()["response"]
    
def chatbot():
    print("Ollama Chatbot (type 'exit' to quit)")
    history = []

    while True:
        user_input = input("You: ")
        if user_input.lower() == "exit":
            break

        bot_reply = chat_with_ollama(user_input, history)
        print("Bot:", bot_reply)

        history.append(("user", user_input))
        history.append(("assistant", bot_reply))

if __name__== "__main__":
    chatbot()
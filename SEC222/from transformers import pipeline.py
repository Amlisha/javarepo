from transformers import pipeline

# Load GPT-2 generator
generator = pipeline("text-generation", model="gpt2")

# Generate text
result = generator(
    "The future of Artificial Intelligence is",
    max_length=50,
    num_return_sequences=1,
    truncation=True
)

print(result[0]["generated_text"])

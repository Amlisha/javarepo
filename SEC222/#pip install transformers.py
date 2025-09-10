#pip install transformers


from transformers import pipeline

# Load texty generation pipeline
generator = pipeline("text-generation",model="gpt2")

#Generate text
result = generator("The future of Artificial intelligenceis",
truncation=True,max_lenght=50,num_return_sequences=1)
print(result[0]['generated_text'])
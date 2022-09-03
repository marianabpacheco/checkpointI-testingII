# checkpointI-testingII
Avaliação de Testing II, do curso Certified Tech Developer.
# Objetivo
Criar um Teste Automatizado com o Selenium para o processo parcial de compra no site: https://opencart.abstracta.us/index.php?route=common/home
Link código  base: https://drive.google.com/file/d/1fEAmc2b2RfZNq8kamNuT6sYOKDgSVqpb/view?usp=sharing 

Pré-condições: Abrir o site

Site a ser testado: https://opencart.abstracta.us/index.php?route=common/home
Título do Caso de Teste: Processo de registro, busca e adição do produto no carrinho.

Testes:
Registro
 Clicar em "My account"
 Selecionar a opção "Register"
 Preencher o formulário de registro com os dados exigidos.
Selecionar a opção “No” para Newsletter 
Preencher a flag  “I have read and agree to the Privacy Policy “ 
Clicar em “Continue”
Verificar se o texto “Congratulations! Your new account has been successfully created!” está visível na tela”

Buscar e adicionar no carrinho
Inserir o texto “Iphone” no campo “search”
Clicar no ícone de lupa para realizar a pesquisa
No primeiro item exibido, clicar em “Add to cart”
Verificar se a frase “Success: You have added iPhone to your shopping cart!” está sendo exibida na tela.
NÃO é necessário concluir o processo de compra.

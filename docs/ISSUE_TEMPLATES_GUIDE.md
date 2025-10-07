# 📋 Guia de Templates de Issues para Professores

## 🎯 Visão Geral

Este guia explica como usar os templates de issues para solicitar alterações no Sistema de Gestão Escolar. Os templates foram criados para tornar mais fácil para professores solicitarem mudanças sem precisar entender os detalhes técnicos do sistema.

## 🤖 Como Funciona

Quando você cria uma issue usando um dos templates:

1. **Preenche um formulário simples** com informações sobre o que você precisa
2. **O Copilot é automaticamente designado** para implementar a solicitação
3. **A issue contém todas as informações técnicas** necessárias para o Copilot
4. **Você recebe notificações** sobre o progresso da implementação

## 📝 Templates Disponíveis

### 1. 🎯 Adicionar Nova Atividade

**Quando usar:** Você quer criar uma nova atividade extracurricular no sistema.

**O que você precisa fornecer:**
- Nome da atividade
- Descrição detalhada
- Tipo/categoria (Esportes, Artes, Acadêmico, etc.)
- Dias da semana
- Horário de início e término
- Capacidade máxima de participantes

**Exemplo de uso:**
> "Quero criar uma nova atividade chamada 'Clube de Robótica' que acontece às terças e quintas, das 15:30 às 17:00, com capacidade para 20 alunos."

---

### 2. ✏️ Modificar Atividade Existente

**Quando usar:** Você precisa alterar detalhes de uma atividade que já existe.

**O que você precisa fornecer:**
- Nome exato da atividade a modificar
- Quais campos deseja alterar
- Novos valores para esses campos
- Justificativa para as alterações

**Exemplo de uso:**
> "Preciso mudar a descrição do 'Chess Club' e alterar a categoria para 'Acadêmico' porque agora focamos em competições escolares."

---

### 3. 📊 Alterar Capacidade de Atividade

**Quando usar:** Você quer aumentar ou diminuir o número máximo de participantes.

**O que você precisa fornecer:**
- Nome da atividade
- Nova capacidade desejada
- Motivo da alteração (alta demanda, novo espaço, etc.)
- Confirmações de recursos e notificações

**Exemplo de uso:**
> "O 'Art Club' está com lista de espera. Conseguimos um espaço maior e quero aumentar de 20 para 30 vagas."

---

### 4. 📅 Alterar Horário de Atividade

**Quando usar:** Você precisa mudar os dias da semana ou horários de uma atividade.

**O que você precisa fornecer:**
- Nome da atividade
- Novos dias da semana
- Novo horário de início e término
- Motivo da alteração
- Análise de impacto nos estudantes

**Exemplo de uso:**
> "O 'Drama Club' precisa mudar de quartas e sextas para terças e quintas porque o teatro não está disponível às quartas."

---

### 5. 🗑️ Remover Atividade

**Quando usar:** Uma atividade precisa ser completamente removida do sistema.

**O que você precisa fornecer:**
- Nome da atividade a remover
- Justificativa
- Status dos participantes (foram notificados e realocados?)
- Confirmações de autorização

**Exemplo de uso:**
> "A atividade 'Old Photography Club' foi descontinuada por falta de interesse. Não há mais participantes inscritos."

**⚠️ Atenção:** Esta ação é irreversível!

---

### 6. 👥 Gerenciar Inscrições de Estudantes

**Quando usar:** Você precisa fazer alterações em massa nas inscrições (transferências, cancelamentos, adições em lote).

**O que você precisa fornecer:**
- Tipo de operação (transferir, cancelar, adicionar, etc.)
- Nome da(s) atividade(s)
- Lista de emails dos estudantes
- Justificativa
- Confirmações de autorização e notificações

**Exemplo de uso:**
> "Quero transferir 5 alunos do 'Chess Club' para o 'Advanced Chess Club' porque eles estão em nível avançado."

---

### 7. 🐛 Reportar Bug

**Quando usar:** Algo no sistema não está funcionando como deveria.

**O que você precisa fornecer:**
- Componente afetado (interface web, API, etc.)
- Descrição do problema
- Comportamento esperado vs. atual
- Passos para reproduzir
- Frequência e gravidade
- Mensagens de erro (se houver)

**Exemplo de uso:**
> "Quando tento inscrever um aluno no 'Chess Club', recebo um erro 500 e a inscrição não é concluída."

---

### 8. ✨ Solicitar Nova Funcionalidade

**Quando usar:** Você tem uma ideia para melhorar o sistema.

**O que você precisa fornecer:**
- Categoria da funcionalidade
- Descrição do problema que resolve
- Solução proposta
- História de usuário (Como [usuário], eu quero [ação], para [benefício])
- Critérios de aceitação
- Prioridade

**Exemplo de uso:**
> "Como professor, eu quero exportar a lista de participantes em CSV para poder importar no meu sistema de notas."

---

## 🚀 Como Criar uma Issue com Template

### Passo a Passo:

1. **Acesse o repositório no GitHub**
   - Vá para: https://github.com/dolivermetal/java-copilot-code-agent

2. **Clique na aba "Issues"**
   - Está no menu superior do repositório

3. **Clique no botão verde "New issue"**
   - Você verá uma lista de templates disponíveis

4. **Escolha o template apropriado**
   - Clique em "Get started" no template que melhor se encaixa na sua necessidade

5. **Preencha o formulário**
   - Complete todos os campos marcados com * (obrigatórios)
   - Seja o mais específico possível
   - Forneça todos os detalhes solicitados

6. **Revise as informações**
   - Verifique se preencheu tudo corretamente
   - Confirme que as informações técnicas no final do template fazem sentido

7. **Clique em "Submit new issue"**
   - O Copilot será automaticamente designado
   - Você receberá notificações sobre o progresso

## 💡 Dicas para Criar Boas Issues

### ✅ Boas Práticas:

- **Seja específico:** Forneça detalhes precisos sobre o que você precisa
- **Use nomes exatos:** Ao mencionar atividades existentes, use o nome exato
- **Explique o contexto:** Ajude o Copilot a entender por que a mudança é necessária
- **Forneça exemplos:** Se possível, dê exemplos do que você quer
- **Preencha todos os campos obrigatórios:** Campos marcados com * são essenciais
- **Valide as informações:** Verifique horários, capacidades e nomes antes de submeter

### ❌ O Que Evitar:

- **Não seja vago:** "Mude algo na atividade" não é suficiente
- **Não use abreviações:** Use nomes completos e claros
- **Não esqueça justificativas:** Sempre explique por que a mudança é necessária
- **Não pule confirmações:** As checkboxes são importantes para garantir que você considerou todos os aspectos
- **Não misture múltiplos pedidos:** Crie issues separadas para pedidos diferentes

## 📊 O Que Acontece Depois

### Fluxo de Processamento:

1. **Issue criada** → Copilot é notificado automaticamente
2. **Copilot analisa** → Verifica se todas as informações necessárias estão presentes
3. **Copilot implementa** → Faz as alterações no código/banco de dados
4. **Copilot testa** → Valida que tudo funciona corretamente
5. **Pull Request criado** → Código é revisado
6. **Merge e Deploy** → Alterações vão para produção
7. **Issue fechada** → Você é notificado da conclusão

### Tempo Estimado:

- **Issues simples** (capacidade, horário): 10-30 minutos
- **Issues médias** (nova atividade, modificação): 30-60 minutos
- **Issues complexas** (nova funcionalidade, bug crítico): 1-4 horas

## ❓ Perguntas Frequentes

### P: E se eu não souber alguma informação técnica?

**R:** Não se preocupe! Os templates são projetados para que você forneça apenas informações do seu conhecimento. As seções técnicas no final são para o Copilot, não para você.

### P: Posso editar uma issue depois de criá-la?

**R:** Sim! Você pode adicionar comentários ou editar a issue se perceber que esqueceu algo.

### P: O que faço se o Copilot fizer perguntas?

**R:** O Copilot pode comentar na issue pedindo esclarecimentos. Responda os comentários com as informações solicitadas.

### P: Como sei se minha solicitação foi concluída?

**R:** Você receberá notificações no GitHub quando o Copilot atualizar a issue. A issue será fechada automaticamente quando concluída.

### P: E se algo der errado?

**R:** Use o template de "Reportar Bug" para informar o problema. O Copilot investigará e corrigirá.

### P: Posso usar os templates para qualquer tipo de mudança?

**R:** Os templates cobrem as situações mais comuns. Se sua necessidade não se encaixa em nenhum template, use o template de "Solicitar Nova Funcionalidade" ou crie uma issue em branco.

## 📚 Recursos Adicionais

- **Documentação do Sistema:** [docs/README.md](./README.md)
- **Repositório:** https://github.com/dolivermetal/java-copilot-code-agent
- **Discussões:** Use a aba "Discussions" para dúvidas gerais

## 🆘 Precisa de Ajuda?

Se você tem dúvidas sobre qual template usar ou como preencher um formulário:

1. Consulte este guia primeiro
2. Veja exemplos de issues já criadas
3. Pergunte na seção "Discussions" do repositório
4. Entre em contato com a equipe de suporte técnico

---

**Lembre-se:** Estes templates foram criados para facilitar sua vida! Quanto mais detalhes você fornecer, mais rápido e preciso será o trabalho do Copilot.

theme: /

    state: Echo
        event!: noMatch
        a: Вы сказали: {{$parseTree.text}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}
        
require: offtopic.sc
    module = newOfftopic

theme: /

    state: You
        q!: * $you *
        a: Я понял, что вы ко мне обратились, но не понял, зачем.

    state: CatchAll
        q!: *
        a: Извините, я вас не понял.
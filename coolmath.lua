local x = 0
local y = 0
local solution = 0
local continuegame = true
local correct = 0
local mathmode = 0
local clientinput = nil

local serverlogic = function() -- shit
    x = math.random(1, 10)
    y = math.random(1, 10)
    mathmode = math.random(1, 3)
    if mathmode == 1 then
        solution = x + y
        print("What is "..x.." + "..y.."?")
    elseif mathmode == 2 then
        solution = x - y
        print("WHat is "..x.." - "..y.."?")
    elseif mathmode == 3 then
        solution = x * y
        print("What is "..x.." x "..y.."?")
    end
end

local clientlogic = function()
    clientinput = tonumber(io.read())
    if clientinput == solution then
        print("Correct!")
        correct = correct + 1
    else
        print("WRONG!")
        continuegame = false
    end
end

while continuegame == true do
    serverlogic()
    clientlogic()
end

print("You did "..correct.." correct!")